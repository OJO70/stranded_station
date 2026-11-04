import javax.print.DocFlavor.STRING;

public interface RoomInterface {
    
    public RoomInterface getNorth();
    public RoomInterface getSouth();
    public RoomInterface getEast();
    public RoomInterface getWest();
    public RoomInterface getUp();
    public RoomInterface getDown();

    public String getLookDescription();

    public String getName();

    public boolean isKeyPresent();
    public void setKeyPresent(final boolean keyPresent);

    public void setUpRoomConnections();

    // public RoomInterface goDirection(final String direction) throws IllegalArgumentException; <- maybe later
}
