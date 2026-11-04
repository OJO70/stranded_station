import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoomTemplateTests {
    
    @Test 
    void getMethodTesting() {
        RoomTemplate testRoom = new RoomTemplate();
        assertEquals(null, testRoom.getDown());
        assertEquals(null, testRoom.getUp());
        assertEquals(null, testRoom.getName());
        assertEquals(null, testRoom.getEast());
        assertEquals(null, testRoom.getSouth());
        assertEquals(null, testRoom.getWest());

        assertEquals(false, testRoom.isKeyPresent());
        
        
    }

    @Test 
    void itemsAndDescriptionTests() {

    }

    
}
