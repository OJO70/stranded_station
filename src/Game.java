public class Game {
    /* Does the player have the key? */
    private static boolean hasKey = false;


    private static boolean keepPlaying = true;



    /* Array to store all rooms */
    public static RoomInterface observationDeck = new ObservationDeck();
    public static RoomInterface laboratory = new Laboratory();
    public static RoomInterface centralCorridor = new CentralCorridor();
    public static RoomInterface crewCabin = new CrewCabin();
    public static RoomInterface storageBay = new StorageBay();
    public static RoomInterface airlock = new Airlock();
    public static RoomInterface escapePod = new EscapePod();

    /*
     * string linked to current location
     * Can be changed to a class call for more genralised code later.
     */
    public  static RoomInterface currentLocation = crewCabin;

    /**
     * Initialise the game map by setting up all rooms and their connections.
     * ToDo:
     * - [ ] Implement the game map initialisation logic
     * - [ ] Implement the game map room connections
     */
    public static void setUpGameMap() {

        observationDeck.setUpRoomConnections();
        laboratory.setUpRoomConnections();
        centralCorridor.setUpRoomConnections();
        crewCabin.setUpRoomConnections();
        storageBay.setUpRoomConnections();
        airlock.setUpRoomConnections();
        escapePod.setUpRoomConnections();
    }

    /**
     * Main game loop will contain the primary loop
     * and control flow logic for the game.
     * ToDo:
     * - [ ] Implement the game while loop
     * - [ ] Implement the game command parser
     * - [ ] Implement the game command executor
     *
     * @return true if player wins, false if player loses or quits. <- there is
     *         currently no lose condition.
     */
    public static boolean gameLoop() {

        setUpGameMap();
        roomIntroduction();
        System.out.println("Welcome to the game!");
        while (keepPlaying) {
            System.out.println("+---------------------------------------------------+");
            System.out.printf("(enter_station|command)[%s]++> ",currentLocation.getName());
            UserAction();
            System.out.println("+---------------------------------------------------+");
            boolean reachedEscapePod = currentLocation == escapePod;

            if (keepPlaying && reachedEscapePod) {

                return true;
            }
        }
        return false;

    }

    /**
     * Game direction logic may be able to simplify.
     * 
     * @param direction
     */
    public static void goCommand(final String direction) {

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

    // Get user input command. Call the parser from utils, with the try and
    // execption. Include while loop. In else if not valid, set string to null;
    // which would do the do while loop again.
    // public static String UserInput() {
    //     return 
    // }

    public static void UserAction() {
        String[] input = null;

        do {
            try {
                input = UUtils.CommandParser();

                if (input[0].equals("h")) {

                MainMenu.ShowCommands();

            }

            else if (input[0].equals("go")) {
                goCommand(input[1]); 
            }


            else if (input[0].equals("take")) {
                takecommand(input[1]);
            }

            else if (input[0].equals("look")) {
                lookCommand();
            }
            else if (input[0].equals("m")) {
                Intro.Map_layout();
                
            }
            
            else if (input[0].equals("help")) {
                helpCommand();
            }

            else if (input[0].equals("q")) {
                System.out.println("Goodbye, Thank you for playing");
                keepPlaying = false;
            }

            else if (input[0].equals("q")) {
                System.out.println("Goodbye, Thank you for playing");
                keepPlaying = false;

            }

            else if (input[0].equals("drop")) {
                //dropCommand();
            }

            // Implement drop in future

            else {
                System.out.printf("Not a valid command. Please press \"h\" for help.\n");
            }
                
            } catch (Exception e) {
                System.out.printf("Not a valid command. Please press \"h\" for help.\n");
            }

            
        } while (input == null);
    }

    /**
     * Change room location to the new room if room exists.
     * 
     * @param newLocation
     */
    public static void changeLocation(final RoomInterface newLocation) {
        if (newLocation != null) {
            if (newLocation == Game.airlock && !hasKey) {
            System.out.println("Acess denied. You need a key to enter the airlock.");

            }else {
            currentLocation = newLocation;
            roomIntroduction();
            }
            // currentLocation = newLocation;
            // roomIntroduction();

        } else {
            System.out.println("You cannot go that way");
        }
    }

    /**
     * Print the introduction for the current room.
     */

    public static void roomIntroduction()
    {
        System.out.println("You are in the " + currentLocation.getName());
    }

    /**
     * Allow a player to look around the room and get a description of the room.
     * 
     * @param direction
     */
    public static void lookCommand() {
        System.out.println("You are looking");
        currentLocation.getLookDescription();
    }

    /**
     * Alow a player to get help with the game and the commands available.
     * 
     * @param direction
     */
    public static void helpCommand() {
        System.out.println(Intro.Tutorial());
    }

    /**
     * 
     * @param direction
     */


     public static int Find_index_of_item_from_room(String[] items , String itemName ) 
    {
        for (int i = 0; i < items.length; i++) 
            {
                if (itemName.equals(items[i])) 
                {
                    return i;
                }
            
        }
        return -1;
    }

    public static int FindLastEmptySpaceInInventory (String[] inventory) 
    {

        for(int i = inventory.length -1 ; i >= 0 ; i -- )
            if (inventory[i] == "") 
            {
            return i;
            }
        
        return -1;
    }

    public static void MoveItemFromSourceToDestination(int source, int dest) throws Exception 
    {


        if (source == -1) 
        {
            throw new Exception("Item is not in room");
        }

        if (dest == -1) 
        {
            throw new Exception("Inventory is full");
        }

        Inventory.inventory[dest] = currentLocation.getItems()[source];

        currentLocation.getItems()[source] = "";
    }



        public static void takecommand(final String itemName) throws Exception
        {

        
            MoveItemFromSourceToDestination(Find_index_of_item_from_room(currentLocation.getItems(), itemName), FindLastEmptySpaceInInventory(Inventory.inventory));

            if (currentLocation.isKeyPresent() && itemName.equals("key")) {
                hasKey = true;
                currentLocation.setKeyPresent(false);
            } 
            else 
            {
                System.out.println("There is no " + itemName + " in this room");
            }
        }

            public static void quitCommand() {

        }
    }


