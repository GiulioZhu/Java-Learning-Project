import java.util.*;

public class Room {
    private int roomNumber;
    ArrayList<String> mates = new ArrayList<String>();
    private String roomIssue = "N/A";

    public Room (int number, String mate1, String mate2) {
        roomNumber = number;
        mates.add(mate1);
        mates.add(mate2);

    }

    public Room (int number, String mate1, String mate2, String mate3) {
        roomNumber = number;
        mates.add(mate1);
        mates.add(mate2);
        mates.add(mate3);
    }

    public void replaceMate (String current, String newMate) {
        for (String mate : mates) {
            if (mate == current) {
                mates.remove(mates.indexOf(mate));
                mates.add(newMate);
            } else {
                System.out.println(current +" not present in room " + roomNumber);
            }
        }
    }
    
    public void getRoomNum() {
        System.out.println(roomNumber);
    }

    public void getRoomMates() {
        System.out.println(mates);
    }

    public void reportIssue (String issue) {
        roomIssue = issue;
    }

    public void getRoomIssue() {
        System.out.println(roomIssue);
    }

}
