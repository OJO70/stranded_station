


public class Laboratory implements RoomInterface {

    protected RoomInterface north = null;
    protected RoomInterface south = Game.centralCorridor;
    protected RoomInterface east = null;
    protected RoomInterface west = null;
    protected RoomInterface up = Game.observationDeck;
    protected RoomInterface down = null;

    protected boolean keyPresent = false;

    protected String lookDescription = "You are now in the Labroratory.";

    public static String[] items = {"Datapad"};

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
            items += "You see a " + item + " in the Escape Pod.\n";
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setKeyPresent'");
    }

    
    
}
