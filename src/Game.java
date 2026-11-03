import rooms.*;

public class Game {



    

    /* Does the player have the key? */
    private static boolean hasKey = false;

    private static RoomInterface templateRoom = new RoomTemplate();

    /* Array to store all rooms */
    public static RoomInterface observationDeck = null;
    public static RoomInterface labratory = null;
    public static RoomInterface centeralCorridor = null;
    public static RoomInterface crewCabin = null;
    public static RoomInterface storageRoom = null;
    public static RoomInterface airlock = null;
    public static RoomInterface escapePod = null;

    /* string linked to current location
     * Can be changed to a class call for more genralised code later.
     */
    private static RoomInterface currentLocation = templateRoom;

    /**
     * Initialise the game map by setting up all rooms and their connections.
     * ToDo:
     * - [ ] Implement the game map initialisation logic
     * - [ ] Implement the game map room connections
     */
    public static void initiliseGameMap(){

    }


    /**
     * Main game loop will contain the primary loop
     * and control flow logic for the game.
     * ToDo:
     * - [ ] Implement the game while loop
     * - [ ] Implement the game command parser
     * - [ ] Implement the game command executor
     *
     * @return true if player wins, false if player loses or quits. <- there is currently no lose condition.
     */
    public static boolean gameLoop()
    {
        System.out.println("You are in the game loop");
        return true;
    }

    

    /**
     * Game direction logic may be able to simplify.
     * @param direction
     */
    public static void goCommand(final String direction)
    {

        RoomInterface nextRoom = null;
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
    public static void changeLocation(final RoomInterface newLocation)
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
     * Allow a player to look around the room and get a description of the room.
     * @param direction
     */
    public static void lookCommand()
    {
        System.out.println("You are looking");
    }

    /**
     * Alow a player to get help with the game and the commands available.
     * @param direction
     */
    public static void helpCommand()
    {
        System.out.println(Intro.Tutorial());
    }

    /**
     * 
     * @param direction
     */
    public static void takeCommand(final String itemName)
    {
        if (currentLocation.isKeyPresent() && itemName.equals("key")) {
            hasKey = true;
            currentLocation.setKeyPresent(false);
        } else {
            System.out.println("There is no " + itemName + " in this room");
        }
    }

    /**
     * Quit the game.
     */
    public static void quitCommand() {
        
    }

    
}
