
public class RoomTemplate implements RoomInterface {

    public static final String ROOM_NAME = "RoomTemplate";

    protected RoomInterface north = null;
    protected RoomInterface south = null;
    protected RoomInterface east = null;
    protected RoomInterface west = null;
    protected RoomInterface up = null;
    protected RoomInterface down = null;

    protected boolean keyPresent = false;

    protected String lookDescription = "you should not be seeing this, something is wrong with the room";
    
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

    public RoomInterface    getDown() {
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

    public RoomInterface goDirection(final String direction) throws IllegalArgumentException {
        RoomInterface nextRoom = null;
        if (direction.equals("north")) {
            nextRoom = this.north;
        } else if (direction.equals("south")) {
            nextRoom = this.south;
        } else if (direction.equals("east")) {
            nextRoom = this.east;
        } else if (direction.equals("west")) {
            nextRoom = this.west;
        } else if (direction.equals("up")) {
            nextRoom = this.up;
        } else if (direction.equals("down")) {
            nextRoom = this.down;
        }else {
            throw new IllegalArgumentException("Invalid direction: " + direction);
        }
        return nextRoom;
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
    public void setUpRoomConnections() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUpRoomConnections'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    
    
}
