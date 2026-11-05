import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class UserActionTests {
    
    @Test 
    public void TestStringSplit() throws Exception {
        String[] test = UUtils.CommandParserDummy("go north");
        assertArrayEquals( new String[] {"go", "north"}, test);
        

    }

    @Test 
    public void TestThreeWordParser() throws Exception {
        String[] test = UUtils.CommandParserDummy("take access card");
        assertArrayEquals(new String[] {"take", "access card"}, test);
    }

    // @Test 
    // public void TestHelp() {
    //     Game.UserAction();
    //     assertEquals()
    // }

}
