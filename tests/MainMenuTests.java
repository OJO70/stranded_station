import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

public class MainMenuTests { 

    @Test
    void testShowCommands() {
        assertDoesNotThrow(() -> MainMenu.ShowCommands());
    }


    // TEST 2: Check minimum valid menu choice (1)
    @Test
    void testMinimumValidChoice() throws Exception {
        UUtils.stdin = new Scanner("1\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(1, result);
    }


    // TEST 3: Check maximum valid menu choice (4)
    @Test
    void testMaximumValidChoice() throws Exception {
        UUtils.stdin = new Scanner("4\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(4, result);
    }


    // TEST 4: Reject a number below the minimum (0)
    @Test
    void testBelowMinimumChoice() throws Exception {
        UUtils.stdin = new Scanner("0\n2\n"); //presses 0 then 2 

        int result = MainMenu.ReadMenuChoice();

        assertEquals(2, result);
    }

}















    

    


