import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

public class MainMenuTests { 

    @Test
    void testShowCommands() {
        assertDoesNotThrow(() -> MainMenu.ShowCommands());
    }


    // TEST 2: Check minimum valid menu choice 1
    @Test
    void testMinimumValidChoice() throws Exception {
        UUtils.stdin = new Scanner("1\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(1, result);
    }


    // TEST 3: Check maximum valid menu choice 4
    @Test
    void testMaximumValidChoice() throws Exception {
        UUtils.stdin = new Scanner("4\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(4, result);
    }


    // TEST 4: rejecting zero
    @Test
    void testBelowMinimumChoice() throws Exception {
        UUtils.stdin = new Scanner("0\n2\n"); //presses 0 then 2 

        int result = MainMenu.ReadMenuChoice();

        assertEquals(2, result);
    }
    // TEST 5: Reject a number above the maximum i.e 5
    @Test
    void testAboveMaximumChoice() throws Exception {
        UUtils.stdin = new Scanner("5\n3\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(3, result);
    }


    // TEST 6: Reject the largest possible integer
    @Test
    void testVeryLargeNumber() throws Exception {
        UUtils.stdin = new Scanner("2147483647\n2\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(2, result);
    }



    // TEST 7: Reject a negative number
    @Test
    void testNegativeNumber() throws Exception {
        UUtils.stdin = new Scanner("-5\n1\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(1, result);
    }

      // TEST 8: Reject the smallest possible integer
    @Test
    void testVerySmallNumber() throws Exception {
        UUtils.stdin = new Scanner("-2147483648\n3\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(3, result);
    }




    // TEST 9: Reject multiple invalid numbers
    @Test
    void testMultipleInvalidNumbers() throws Exception {
        UUtils.stdin = new Scanner("0\n5\n100\n-3\n3\n");

        int result = MainMenu.ReadMenuChoice();

        assertEquals(3, result);
    }
}





















    

    


