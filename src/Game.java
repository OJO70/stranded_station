public class Game {

    private static Room templateRoom = new RoomTemplate();

    /* string linked to current location
     * Can be changed to a class call for more genralised code later.
     */
    private static Room currentLocation = templateRoom;

    /* Does the player have the key? */
    private static boolean hasKey = false;



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

        Room nextRoom = null;
        if (direction.equals("north")) {
            nextRoom = currentLocation.getNorth();
        } else if (direction.equals("south")) {
            nextRoom = currentLocation.getSouth();
        } else if (direction.equals("east")) {
            nextRoom = currentLocation.getEast();
        } else if (direction.equals("west")) {
            nextRoom = currentLocation.getWest();
        } else if (direction.equals("up")) {
            nextRoom = currentLocation.getUp();
        } else if (direction.equals("down")) {
            nextRoom = currentLocation.getDown();
        } else {
            System.out.println(direction + " is not a valid direction");
        }
        changeLocation(nextRoom);
    }

    /**
     * Change room location to the new room if room exists.
     * @param newLocation
     */
    public static void changeLocation(final Room newLocation)
    {
        if (newLocation != null) {
        currentLocation = newLocation;

        } else {
            System.out.println("You cannot go that way");
        }
    }

    /**
     * Print the introduction for the current room.
     */
    public static void roomIntroduction()
    {
        System.out.println("You are in a room" + currentLocation.getLookDescription());
    }

    /**
     * 
     * @param direction
     */
    public static void lookCommand()
    {
        System.out.println("You are going ");
    }

    /**
     * 
     * @param direction
     */
    public static void helpCommand()
    {
        System.out.println("You are going ");
    }

    /**
     * 
     * @param direction
     */
    public static void takeCommand(final String itemName)
    {
        if (currentLocation.isKeyPresent() && itemName.equals("key")) {
            hasKey = true;
            currentLocation.keyPresent = false;
        } else {
            System.out.println("There is no " + itemName + " in this room");
        }
    }

    
}
