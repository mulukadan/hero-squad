import java.util.ArrayList;
import java.util.List;

public class Hero{
  private String hName;
  private int hAge;
  private String hSpecialPower;
  private String hWeakness;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int hId;

  //Constractor
  public Hero(String Name, int Age, String Spower, String Weakness){
    hName = Name;
    hAge = Age;
    hSpecialPower = Spower;
    hWeakness = Weakness;
    instances.add(this);
    hId = instances.size();
  }
  public String getName(){
    return hName;
  }
  public int getAge(){
    return hAge;
  }
  public String getSpecialPower(){
    return hSpecialPower;
  }
  public String getWeakness(){
    return hWeakness;
  }
  public int getId(){
    return hId;
  }
  public static List<Hero> all(){
    return instances;
  }
  public static void clear(){
    instances.clear();
  }
}
