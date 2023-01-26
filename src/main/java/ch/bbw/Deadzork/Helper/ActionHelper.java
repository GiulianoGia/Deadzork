package ch.bbw.Deadzork.Helper;

import ch.bbw.Deadzork.Models.*;

import java.util.List;
import java.util.Objects;


public class ActionHelper {
    ScannerHelper scanner = new ScannerHelper();

    public void listAllActions() {
        System.out.println("Please Choose an Action:");
        int round = 0;
        for (Actions action : Actions.values()) {
            round++;
            System.out.println(round + ": " + action);
        }
    }

    public void listAllRooms(List<Room> roomList) {
        int round = 0;
        for (Room room : roomList) {
            round++;
            System.out.println(round + ": " + room.getName());
        }
    }

    public Room findRoomByName(List<Room> roomList, String name) {
        Room chosenRoom = new Room();
        for (Room room : roomList) {
            if (Objects.equals(room.getName(), name)) {
                chosenRoom = room;
            }
        }
        return chosenRoom;
    }

    public Room chooseRoom(List<Room> roomList) {
        listAllRooms(roomList);

        String chosenRoom = scanner.getUserInput("Which Room do you want to enter?");
        if (Objects.equals(chosenRoom, "1")) {
            return findRoomByName(roomList, "Office");
        } else if (Objects.equals(chosenRoom, "2")) {
            return findRoomByName(roomList, "Lounge");
        } else if (Objects.equals(chosenRoom, "3")) {
            return findRoomByName(roomList, "Storage");
        } else if (Objects.equals(chosenRoom, "4")) {
            return findRoomByName(roomList, "Meeting Room");
        }
        return new Room();
    }

    public Subject chooseSubjectToRemove(List<Subject> subjectList) {
        int round = 0;
        for (Subject subject : subjectList) {
            round++;
            System.out.println(round + ": " + subject.getName());
        }
        String chosenSubject = scanner.getUserInput("Which item do you want to remove?");
        return subjectList.get(Integer.parseInt(chosenSubject) - 1);
    }

    public Boolean zorkieAttackPlayer(Player player, Zorkies zorkies, List<Weapon> weaponList) {
        System.out.println("A Zorkie Level " + zorkies.getLevel() + " attacks you!");
        int round = 0;
        for (Subject subject : player.getInventory()) {
            round++;
            System.out.println(round + ": " + subject.toString());
        }
        String chosenWeapon = scanner.getUserInput("Which Weapon do you want to use?");
        Weapon playerWeapon = weaponList.get(Integer.parseInt(chosenWeapon) - 1);
        while (player.getLife() > 0 && zorkies.getLife() > 0) {
            player.lowerLife(zorkies.getAttack());
            System.out.println("Life remaining: "+player.getLife());
            zorkies.lowerLife(playerWeapon.getDamage());
            System.out.println("Zorkie life remaining: "+zorkies.getLife());
        }
        if (zorkies.getLife() <= 0) {
            System.out.println("You killed a Zorkie");
            return true;
        } else if (player.getLife() <= 0) {
            System.out.println("You have been defeted!");
            return false;
        } else {
            return false;
        }
    }
}
