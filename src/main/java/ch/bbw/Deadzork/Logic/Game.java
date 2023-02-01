package ch.bbw.Deadzork.Logic;

import ch.bbw.Deadzork.Helper.ActionHelper;
import ch.bbw.Deadzork.Helper.ScannerHelper;
import ch.bbw.Deadzork.Mappers.RoomMapper;
import ch.bbw.Deadzork.Mappers.WeaponMapper;
import ch.bbw.Deadzork.Mappers.ZorkiesMapper;
import ch.bbw.Deadzork.Models.*;
import org.springframework.validation.ObjectError;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Game {
    // Helpers
    private final ScannerHelper scanner = new ScannerHelper();
    private final ActionHelper actionHelper = new ActionHelper();
    // Mappers
    private final WeaponMapper weaponMapper = new WeaponMapper();
    private final ZorkiesMapper zorkiesMapper = new ZorkiesMapper();
    private final RoomMapper roomMapper = new RoomMapper();
    //Lists
    public List<Weapon> weaponList = new ArrayList<>();
    public List<Zorkies> zorkiesList = new ArrayList<>();
    public List<Room> roomList = new ArrayList<>();

    private String action = "";
    private Room currentRoom = new Room();

    public Game() throws FileNotFoundException {}

    private Player createNewPlayer() {
        String username = scanner.getUserInput("What is your name?");
        return new Player(username);
    }

    private void announceTheGame() {
        // Here should The Game be announced
        System.out.println("Welcome to Deadzork!");
    }

    private Boolean checkIfPlayerHasAllKeys(Player player) {
        var count = 0;
        for (Subject subject : player.getInventory()) {
            if (subject.getName().equals("Key1") || subject.getName().equals("Key2") || subject.getName().equals("Key3")) {
                count++;
            }
        }
        return count == 3;
    }

    public void startGame() throws FileNotFoundException {
        Player player = createNewPlayer();

        weaponList = weaponMapper.generateWeapons();
        zorkiesList = zorkiesMapper.generateZorkies();
        roomList = roomMapper.generateWeapons();

        ArrayList<Room> roomLogs = new ArrayList<>();
        var round = 0;

        announceTheGame();

        actionHelper.listAllActions();

        while (!Objects.equals(action, "1")) {
            Boolean hasPlayerWon = checkIfPlayerHasAllKeys(player);
            if (hasPlayerWon) {
                System.out.println("You have won the Game");
                System.out.println("You are the ultimate Zorkie Champion!");
                break;
            }
            action = scanner.getUserInput("What do you want to do?");
            if (Objects.equals(action, "2")) {
                actionHelper.listAllRooms(roomList);
            }
            else if (Objects.equals(action, "3")) {
                actionHelper.listAllActions();
            }
            else if (Objects.equals(action, "4")) {
                player.showInventory();
            }
            else if (Objects.equals(action, "5") && !Objects.equals(currentRoom.getName(), null)) {
                if (this.currentRoom.getWeaponList().size() > 0) {
                    player.addSubjectToInventory(this.currentRoom.getWeaponList().get(0));
                    this.currentRoom.removeWeapon(this.currentRoom.getWeaponList().get(0));
                    System.out.println("Weapon has been picked up");
                } else {
                    System.out.println("This Room hasn't got any Weapons!");
                }
            }
            else if (Objects.equals(action, "6")) {
                Subject chosenSubject = actionHelper.chooseSubjectToRemove(player.getInventory());
                player.removeSubjectFromInventoryWithSubject(chosenSubject);
                this.currentRoom.addSubject(chosenSubject);
            }
            else if (Objects.equals(action, "7")) {
                Room chosenRoom = actionHelper.chooseRoom(roomList);
                if (!Objects.equals(chosenRoom, currentRoom) && chosenRoom != null) {
                    this.currentRoom = chosenRoom;
                    roomLogs.add(this.currentRoom);
                    round++;
                    System.out.println("You enter "+chosenRoom.getName());
                    if (chosenRoom.getWeaponList().size() > 0) {
                        System.out.println("In this room are Weapons!");
                    }
                    if (this.currentRoom.getZorkiesList().size() > 0) {
                        Boolean hasWon = actionHelper.zorkieAttackPlayer(player, this.currentRoom.getZorkiesList().get(0), weaponList);
                        if (currentRoom.getZorkiesList().get(0).getKeyList().size() > 0) {
                            currentRoom.addSubject(currentRoom.getZorkiesList().get(0).getKeyList().get(0));
                        }
                        currentRoom.removeZorkie(this.currentRoom.getZorkiesList().get(0));
                        if (!hasWon) action = "1";
                    }
                } else {
                    System.out.println("You cannot enter this room...");
                }
            } else if (Objects.equals(action, "8")) {
                if (roomLogs.size() > 1) {
                    this.currentRoom = roomLogs.get(round - 2);
                    System.out.println("You go back to "+this.currentRoom.getName());
                    roomLogs.remove(this.currentRoom);
                } else {
                    System.out.println("You haven't been in any room!");
                }
            }
        }
    }
}
