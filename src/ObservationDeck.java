



public class ObservationDeck implements RoomInterface {

    protected RoomInterface north = null;
    protected RoomInterface south = null;
    protected RoomInterface east = null;
    protected RoomInterface west = null;
    protected RoomInterface up = null;
    protected RoomInterface down = Game.laboratory;

    protected boolean keyPresent = true;

    protected String name = "Observation Deck";
    protected String lookDescription = "As you look around the observation deck it is deathly quiet...\nThe cold emptyness of space floods your view. Nothing for forever...\n";

    public static String[] items = {"Access Card", "", "", "", ""};

    public ObservationDeck() {
        items = new String[] {"Access Card", "", "", "", ""};
    }


    // Empty room for now.
    String[] roomContent = {"key"};

    @Override
    public void setUpRoomConnections() {
        this.down = Game.laboratory;
        
    }
    
    public RoomInterface getNorth() {
        return this.north;
    }

    public RoomInterface getSouth() {
        return this.south;
    }

    public RoomInterface getEast() {
        return this.east;
    }

    public RoomInterface getWest() {
        return this.west;
    }

    public RoomInterface getUp() {
        return this.up;
    }

    public RoomInterface getDown() {
        return this.down;
    }

    public String getLookDescription() 
    {
        String items = "";
        for (String item : this.items) 
        {
            if (!item.equals("")) {
                items += "You see a " + item + " in the " + name + ".\n";
            }
            
        }
        String output = this.lookDescription + "\n" + items;
        return output;
    }

    public boolean isKeyPresent() {
        return this.keyPresent;
    }

    /**    (non-Javadoc)
     * This is AI I hate it only for debuging and explenation
     * @see java.lang.Object#toString()
     */
    @Override 
    public String toString() {
        return "RoomTemplate [north=" + north + ", south=" + south + ", east=" + east + ", west=" + west + ", up="
                + up + ", down=" + down + ", keyPresent=" + keyPresent + ", lookDescription=" + lookDescription
                + "]";
    }

    @Override
    public void setKeyPresent(boolean keyPresent) {
        this.keyPresent = keyPresent;
    }

    @Override
    public String getName() {
        return this.name;
    }



    @Override
    public String[] getItems() {
        
        return this.items;
    }

    
    
}
