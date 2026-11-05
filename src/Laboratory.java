



public class Laboratory implements RoomInterface {

    protected RoomInterface north = null;
    protected RoomInterface south = Game.centralCorridor;
    protected RoomInterface east = null;
    protected RoomInterface west = null;
    protected RoomInterface up = Game.observationDeck;
    protected RoomInterface down = null;

    protected boolean keyPresent = false;

    protected String name = "Labroratory";
    protected String lookDescription = "The bubbling of test tubes drone on as you step foot in the laboratory.\nThere is an arsenal of equipment scattered accross the room. Looks like everyone left in a hurry...\n";


    public static String[] items = {"Datapad", "", "", "", ""};


    public Laboratory() {
        items = new String[] {"Datapad", "", "", "", ""};
    }

    @Override
    public void setUpRoomConnections() {
        this.south = Game.centralCorridor;
        this.up = Game.observationDeck;
        
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
        this.keyPresent = false;
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
