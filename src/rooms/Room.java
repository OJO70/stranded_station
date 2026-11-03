package rooms;

/**
 * @deprecated This class is deprecated and should not be used directly. Use RoomTemplate instead.
 * This class will be left for example purposes ONLY!!!
 * Room
 */
public class Room implements RoomInterface {

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

    @Override
    public void setKeyPresent(boolean keyPresent) {
        this.keyPresent = keyPresent;
    }
    
    
}
