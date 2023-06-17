import java.util.*;

public class Room {
    private String roomNumber;
    ArrayList<String> mates = new ArrayList<String>();
    private String roomIssue = "N/A";

    public Room (String number, String mate1, String mate2) {
        roomNumber = number;
        mates.add(mate1);
        mates.add(mate2);

    }

    public Room (String number, String mate1, String mate2, String mate3) {
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
            }
        }
    }
    
    public String getRoomNum() {
        return roomNumber;
    }

    public ArrayList<String> getRoomMates() {
        return mates;
    }

    public void reportIssue (String issue) {
        roomIssue = issue;
    }

    public String getRoomIssue() {
        return roomIssue;
    }

    public String toCSV() {
        return roomNumber + "," + mates.get(0) + "," + mates.get(1) + "," + mates.get(2) + "," + roomIssue; // roomIssue still needs to be developed in the future. Atm it's present but unused.
    }
}
