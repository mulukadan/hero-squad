import org.junit.*;
import static org.junit.Assert.*;

public class TestSquad {

  @Test
  public void Task_instantiatesCorrectly_true() {
    Squad mySquad = new Squad(1,"Scorpion", "Fighting");
    assertEquals(true, mySquad instanceof Squad);
  }

  @Test
 public void Task_instantiatesWithDescription_String() {
   Squad mySquad = new Squad(1,"Scorpion", "Fighting");
   assertEquals("Scorpion", mySquad.getName());
 }

}
