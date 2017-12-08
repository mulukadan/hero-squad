import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
//Sting Heroku Port
    ProcessBuilder process = new ProcessBuilder();
     Integer port;
     if (process.environment().get("PORT") != null) {
         port = Integer.parseInt(process.environment().get("PORT"));
     } else {
         port = 4567;
     }
    setPort(port);
//App Routes
  get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    get("/squads", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("squads", Squad.all());
        model.put("template", "templates/squads.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
    get("/squads/new", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/squad-form.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

    post("/squads", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        String name = request.queryParams("name");
        int maxSize = Integer.parseInt(request.queryParams("maxsize"));
        String Desc = request.queryParams("desc");
        Squad newSquad = new Squad(maxSize, name, Desc);
        model.put("Message", "Squad Added Successfuly!!");
        model.put("link", "/squads");
        model.put("linkto", "All Squads");
        model.put("template", "templates/success.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
      get("/squads/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squad", squad);
            model.put("template", "templates/squad.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());
 }
}
