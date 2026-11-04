public class CentralCorridor implements RoomInterface {

    protected RoomInterface north = Game.laboratory;
    protected RoomInterface south = Game.airlock;
    protected RoomInterface east = Game.storageBay;
    protected RoomInterface west = Game.crewCabin;
    protected RoomInterface up = null;
    protected RoomInterface down = null;

    protected boolean keyPresent = false;

    protected String name = "Central Corridor";
    protected String lookDescription = "You are in the Central Corridor.";

    public static String[] items = {""};

    @Override
    public void setUpRoomConnections() {
        this.north = Game.laboratory;
        this.south = Game.airlock;
        this.east = Game.storageBay;
        this.west = Game.crewCabin;
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

    public String getLookDescription() {
        return this.lookDescription;
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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String[] getItems() {
        
        return this.items;
    }
    
}