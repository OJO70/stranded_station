package rooms;
public class RoomTemplate extends Room implements RoomInterface {

    protected Room north = null;
    protected Room south = null;
    protected Room east = null;
    protected Room west = null;
    protected Room up = null;
    protected Room down = null;

    protected boolean keyPresent = false;

    protected String lookDescription = "you should not be seeing this, something is wrong with the room";
    
    public Room getNorth() {
        return this.north;
    }

    public Room getSouth() {
        return this.south;
    }

    public Room getEast() {
        return this.east;
    }

    public Room getWest() {
        return this.west;
    }

    public Room getUp() {
        return this.up;
    }

    public Room getDown() {
        return this.down;
    }

    public String getLookDescription() {
        return this.lookDescription;
    }

    public boolean isKeyPresent() {
        return this.keyPresent;
    }

    public void setKeyPresent(final boolean keyPresent) {
        this.keyPresent = keyPresent;
    };

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

    
    
}
