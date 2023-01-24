package ch.bbw.Deadzork.Helper;

import ch.bbw.Deadzork.Models.Actions;
import ch.bbw.Deadzork.Models.Room;

import java.util.List;
import java.util.Objects;


public class ActionHelper {
    ScannerHelper scanner = new ScannerHelper();

    public void listAllActions() {
        System.out.println("Please Choose an Action:");
        Integer round = 0;
        for (Actions action : Actions.values()) {
            round++;
            System.out.println(round + ": " + action);
        }
    }

    public void listAllRooms(List<Room> roomList) {
        Integer round = 0;
        for (Room room : roomList) {
            round++;
            System.out.println(round + ": " + room.getName());
        }
    }

    public String chooseRoom(List<Room> roomList) {
        listAllRooms(roomList);

        String chosenRoom = scanner.getUserInput("Which Room do you want to enter?");
        if (Objects.equals(chosenRoom, "1")) {
            return "Office";
        } else if (Objects.equals(chosenRoom, "2")) {
            return "Lounge";
        } else if (Objects.equals(chosenRoom, "3")) {
            return "Storage";
        } else if (Objects.equals(chosenRoom, "4")) {
            return "Meeting Room";
        }
        return "null";
    }
}
