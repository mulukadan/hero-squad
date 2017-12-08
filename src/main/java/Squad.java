import java.util.ArrayList;
import java.util.List;

public class Squad{
  private int sMaxSize;
  private String sName;
  private String sCause;
  // private static List<Squad> instances = new Arraylist<Squad>();
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;

  //Constractor
  public Squad(int Maxsize, String Name, String Cause){
     sMaxSize = Maxsize;
     sName = Name;
     sCause = Cause;
     instances.add(this);
     mId = instances.size();
  }

  public int getMaxSize(){
    return sMaxSize;
  }
  public String getName(){
    return sName;
  }
  public String getCause(){
    return sCause;
  }
  public int getId(){
    return mId;
  }
  public static List<Squad> all(){
    return instances;
  }
  public static void clear(){
    instances.clear();
  }

}
