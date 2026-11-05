import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;





public class IntroTests {

    @Test
void testIntroContainsStory() {
    String result = Intro.Intro();

    assertTrue(result.contains("SMASH!"));
}

@Test
void testIntroIsNotEmpty() {
    String result = Intro.Intro();

    assertFalse(result.isEmpty());
}



@Test
void testTutorialContainsDirections() {
    String result = Intro.Tutorial();

    assertTrue(result.contains("North"));
    assertTrue(result.contains("South"));
    assertTrue(result.contains("East"));
    assertTrue(result.contains("West"));
    assertTrue(result.contains("Up"));
    assertTrue(result.contains("Down"));
}

@Test
void testTutorialContainsGoCommand() {
    String result = Intro.Tutorial();

    assertTrue(result.contains("GO"));




}

//Dont know how to test the Ascii art if there is a way.
    






    
}
