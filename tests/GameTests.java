import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class GameTests {
    
    @Test 
    public void goDirectionTests() throws Exception {

        Game.gameRest();
        
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

        // Game.goCommand("south");
        // assertEquals(Game.airlock, Game.currentLocation);
        // Game.goCommand("down");
        // assertEquals(Game.escapePod, Game.currentLocation);



    }

    @Test 
    public void setupMapTest() {

    }

    @Test 
    public void userActionTests() {
        Game.gameRest();

        assertEquals("You are looking: " + new CrewCabin().getLookDescription(), Game.lookCommand());
    }



    @Test 
    public void changeLocationTests() throws Exception {
        Game.setUpGameMap();
        Game.currentLocation = Game.crewCabin;

        assertDoesNotThrow(()->{Game.changeLocation(null);});

        // most functions tested in goCommand Tests.


    }

    @Test 
    public void DissalowedMovementTests() throws Exception {


        Game.gameRest();

        assertEquals(Game.crewCabin, Game.currentLocation);
        Game.goCommand("down");
        assertEquals(Game.crewCabin, Game.currentLocation);

        Game.goCommand("up");
        assertEquals(Game.crewCabin, Game.currentLocation);
        Game.goCommand("left");
        assertEquals(Game.crewCabin, Game.currentLocation);

        Game.goCommand("what");
        assertEquals(Game.crewCabin, Game.currentLocation);

        
        assertEquals("jump is not a valid direction", Game.goCommand("jump"));
        
        assertEquals("You cannot go that way", Game.changeLocation(null));
        assertEquals("You enter the Observation Deck", Game.changeLocation(Game.observationDeck));

    }

    @Test 
    public void KeyMovementTests() throws Exception {
        
    }

    @Test 
    public void invalidCommandTests() {
        
    }

    @Test 
    public  void validCommands() {

    }

    @Test 
    public void displayTests() {

    }
}
