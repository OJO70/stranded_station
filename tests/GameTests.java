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
    public void changeLocationTests() throws Exception {
        Game.setUpGameMap();
        Game.currentLocation = Game.crewCabin;

        assertDoesNotThrow(()->{Game.changeLocation(null);});

        // most functions tested in goCommand Tests.


    }

    @Test 
    public void DissalowedMovementTests() throws Exception {

    }

    @Test 
    public void KeyMovementTests() throws Exception {

    }
}
