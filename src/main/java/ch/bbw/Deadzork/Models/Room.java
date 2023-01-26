package ch.bbw.Deadzork.Models;

import java.util.List;

public class Room {
    private String name;
<<<<<<< Updated upstream
    private Boolean disabled;
    private List<Subject> weaponList;
    private List<Zorkies> zorkiesList;
=======
    private List<Subject> itemsInRoom;
    private List<Subject> accessibleRooms;
    private Integer nrOfZorkies;
    private Boolean isClosed;


    public Room(String name, List<Subject> itemsInRoom, List<Subject> accessibleRooms, Integer nrOfZorkies, Boolean isClosed) {
        this.name = name;
        this.itemsInRoom = itemsInRoom;
        this.accessibleRooms = accessibleRooms;
        this.nrOfZorkies = nrOfZorkies;
        this.isClosed = isClosed;
    }

>>>>>>> Stashed changes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< Updated upstream
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public List<Subject> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Subject> weaponList) {
        this.weaponList = weaponList;
    }

    public List<Zorkies> getZorkiesList() {
        return zorkiesList;
    }

    public void setZorkiesList(List<Zorkies> zorkiesList) {
        this.zorkiesList = zorkiesList;
    }

    public void removeWeapon(Subject weapon) {
        this.weaponList.remove(weapon);
    }

    public void addSubject(Subject weapon) { this.weaponList.add(weapon); }
=======
    public List<Subject> getItemsInRoom() {
        return itemsInRoom;
    }

    public void setItemsInRoom(List<Subject> itemsInRoom) {
        this.itemsInRoom = itemsInRoom;
    }

    public List<Subject> getAccessibleRooms() {
        return accessibleRooms;
    }

    public void setAccessibleRooms(List<Subject> accessibleRooms) {
        this.accessibleRooms = accessibleRooms;
    }

    public Integer getNrOfZorkies() {
        return nrOfZorkies;
    }

    public void setNrOfZorkies(Integer nrOfZorkies) {
        this.nrOfZorkies = nrOfZorkies;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public void setClosed(Boolean closed) {
        isClosed = closed;
    }
>>>>>>> Stashed changes
}
