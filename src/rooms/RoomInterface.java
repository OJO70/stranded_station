package rooms;
public interface RoomInterface {
    
    public Room getNorth();
    public Room getSouth();
    public Room getEast();
    public Room getWest();
    public Room getUp();
    public Room getDown();

    public String getLookDescription();

    public boolean isKeyPresent();
    public void setKeyPresent(final boolean keyPresent);
}
