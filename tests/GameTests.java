import static org.junit.Assert.assertEquals;

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
    }

    @Test 
    public void changeLocationTests() throws Exception {

    }

    @Test 
    public void DissalowedMovementTests() throws Exception {

    }

    @Test 
    public void KeyMovementTests() throws Exception {

    }
}
