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

 @Test
public void Hero_instantiatesCorrectly_true() {
  Hero myHero = new Hero("Mulu", 16, "","");
  assertEquals(true, myHero instanceof Hero);
}

@Test
public void Hero_instantiatesWithName_String() {
 Hero myHero = new Hero("Mulu", 16, "","");
 assertEquals("Mulu", myHero.getName());
}

}
