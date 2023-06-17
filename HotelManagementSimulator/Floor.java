import java.util.*;

public class Floor {
    private int floorNum;
    ArrayList<Room> rooms = new ArrayList<Room>();
    Map<Integer, ArrayList<Room>> floors = new HashMap<Integer, ArrayList<Room>>();

    public Floor (int floor) {
        floorNum = floor;
        floors.put(floorNum, rooms);
    }
    
    public void insertRoom (Room room) {
        rooms.add(room);
    }

    public void deleteRoom (int floor, String roomNumber) {
        for (Room room : floors.get(floor)) {
            if (room.getRoomNum().equals(roomNumber)) {
                floors.get(floor).remove(rooms.indexOf(room));
            }
        }
    }

    public int getNumOfRooms(int floor) {
        try {
            return floors.get(floor).size();
        } catch (Exception e) {
            return -1;
        }
    }
}
