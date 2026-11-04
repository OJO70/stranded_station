public class CrewCabin implements RoomInterface {

    protected RoomInterface north = null;
    protected RoomInterface south = null;
    protected RoomInterface east = Game.centralCorridor;;
    protected RoomInterface west = null;
    protected RoomInterface up = null;
    protected RoomInterface down = null;

    protected boolean keyPresent = false;

    protected String name = "Crew Cabin";
    protected String lookDescription = "You are in the Crew Cabin.";

    public static String[] items = {"Torch"};

    @Override
    public void setUpRoomConnections() {
        this.east = Game.centralCorridor;
        
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
            items += "You see a " + item + " in the Crew Cabin.\n";
        }
        String output = this.lookDescription + "\n you see" + items + " Around the room";
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
    public String[] getItems() {
        
        return this.items;
    }

    @Override
    public String getName() {
        return this.name;
    }
    



    
    
}
