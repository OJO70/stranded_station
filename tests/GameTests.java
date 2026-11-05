import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

public class GameTests {

    @Test
    public void goDirectionTests() throws Exception {
        Game.setUpGameMap();
        assertEquals(Game.crewCabin, Game.currentLocation);
        Game.goCommand("down");
        assertEquals(Game.crewCabin, Game.currentLocation);

        Game.goCommand("east");
        assertEquals(Game.centralCorridor, Game.currentLocation);
        Game.goCommand("east");
        assertEquals(Game.storageBay, Game.currentLocation);

        Game.goCommand("west");
        assertEquals(Game.centralCorridor, Game.currentLocation);
        Game.goCommand("west");
        assertEquals(Game.crewCabin, Game.currentLocation);

        Game.goCommand("east");
        assertEquals(Game.centralCorridor, Game.currentLocation);

        Game.goCommand("north");
        assertEquals(Game.laboratory, Game.currentLocation);
        Game.goCommand("up");
        assertEquals(Game.observationDeck, Game.currentLocation);

        Game.goCommand("down");
        assertEquals(Game.laboratory, Game.currentLocation);
        Game.goCommand("south");
        assertEquals(Game.centralCorridor, Game.currentLocation);

        Game.goCommand("south");
        assertEquals(Game.airlock, Game.currentLocation);
        Game.goCommand("down");
        assertEquals(Game.escapePod, Game.currentLocation);

    }

    @Test
    public void setupMapTest() {

    }

    @Test
    public void userActionTests() {
        Game.gameRest();

        assertEquals(new CrewCabin().getLookDescription(), Game.lookCommand());
    }

    @Test
    public void changeLocationTests() throws Exception {
        Game.setUpGameMap();
        Game.currentLocation = Game.crewCabin;

        assertDoesNotThrow(() -> {
            Game.changeLocation(null);
        });

    }

    @Test
    public void DissalowedMovementTests() throws Exception {

        Game.setUpGameMap();
        assertEquals(Game.crewCabin, Game.currentLocation);
        Game.goCommand("down");
        assertEquals(Game.crewCabin, Game.currentLocation);

        Game.goCommand("up");
        assertEquals(Game.centralCorridor, Game.currentLocation);
        Game.goCommand("left");
        assertEquals(Game.storageBay, Game.currentLocation);

        Game.goCommand("west");
        assertEquals(Game.centralCorridor, Game.currentLocation);
        Game.goCommand("west");
        assertEquals(Game.crewCabin, Game.currentLocation);

        Game.goCommand("east");
        assertEquals(Game.centralCorridor, Game.currentLocation);

        Game.goCommand("north");
        assertEquals(Game.laboratory, Game.currentLocation);
        Game.goCommand("up");
        assertEquals(Game.observationDeck, Game.currentLocation);

        Game.goCommand("down");
        assertEquals(Game.laboratory, Game.currentLocation);
        Game.goCommand("south");
        assertEquals(Game.centralCorridor, Game.currentLocation);

        Game.goCommand("south");
        assertEquals(Game.airlock, Game.currentLocation);
        Game.goCommand("down");
        assertEquals(Game.escapePod, Game.currentLocation);
    }

    @Test
    public void KeyMovementTests() throws Exception {

    }

    @Test
    public void invalidCommandTests() {

    }

    @Test
    public void validCommands() {

    }

    @Test
    public void displayTests() {

    }

    // TEST 1 Check that examining a Torch returns its description.
    @Test
    public void testExamineTorch() {

        Inventory.inventory[0] = "Torch";

        String result = Game.examineItem("Torch");

        assertEquals("A portable light source 🔦.", result);

    }

    // TEST 2 Leading spaces with Datapad
    @Test
    public void testExamineLeadingSpaces() {
        Inventory.inventory[0] = "Datapad";

        String result = Game.examineItem("   Datapad");

        assertEquals("A device containing information 📱.", result);

    }


    // TEST 3 Spaces on both sides of Access Card
@Test
public void testExamineSurroundingSpaces() {
    Inventory.inventory[2] = "Access Card";

    String result = Game.examineItem("   Access Card   ");

    assertEquals("A card that grants access to restricted areas 🔑.", result);

}

// TEST 4 Tab only
@Test
public void testExamineTabOnly() {
    String result = Game.examineItem("\t");

    assertEquals("Please specify an item to examine.", result);
}





}
