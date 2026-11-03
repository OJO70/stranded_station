public class Game {

    /* string linked to current location
     * Can be changed to a class call for more genralised code later.
     */
    private static String currentLocation = "START";

    /* Does the player have the key? */
    private static boolean hasKey = false;

    /**
     * Not currently needed but will be used if DROP is implemented.
     */
    private static String keyLocation = "ROOM1";


    /**
     * Main game loop will contain the primary loop
     * and control flow logic for the game.
     * @return
     */
    public static boolean gameLoop()
    {
        System.out.println("You are in the game loop");
        return true;
    }

    

    /**
     * 
     * @param direction
     */
    public static void goCommand(final String direction)
    {
        
    }

    /**
     * 
     * @param direction
     */
    public static void lookCommand(final String direction)
    {
        System.out.println("You are going " + direction);
    }

    /**
     * 
     * @param direction
     */
    public static void helpCommand(final String direction)
    {
        System.out.println("You are going " + direction);
    }

    /**
     * 
     * @param direction
     */
    public static void takeCommand(final String direction)
    {
        System.out.println("You are going " + direction);
    }

    
}
