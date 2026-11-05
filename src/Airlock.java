public class Airlock implements RoomInterface {

    protected RoomInterface north =Game.centralCorridor;
    protected RoomInterface south = null;
    protected RoomInterface east = null;
    protected RoomInterface west = null;
    protected RoomInterface up = null;
    protected RoomInterface down = Game.escapePod;

    protected boolean keyPresent = false;

    protected String name = "Airlock";
    protected String lookDescription = "The cold steel wall stands tall, a dim amber glow shines at the base of it. It looks like there's a place place an access card here...\n";

    public static String[] items = {""};

    @Override
    public void setUpRoomConnections() {
        this.north = Game.centralCorridor;
        this.down = Game.escapePod;
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