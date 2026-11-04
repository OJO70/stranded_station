


public class ObservationDeck implements RoomInterface {

    protected RoomInterface north = null;
    protected RoomInterface south = null;
    protected RoomInterface east = null;
    protected RoomInterface west = null;
    protected RoomInterface up = null;
    protected RoomInterface down = Game.laboratory;

    protected boolean keyPresent = true;

    protected String name = "Observation Deck";
    protected String lookDescription = "As you look around the observation deck it is deathly quiet...\n";

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
        this.keyPresent = keyPresent;
    }

    @Override
    public String getName() {
        return this.name;
    }

    
    
}
