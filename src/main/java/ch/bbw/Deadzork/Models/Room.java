package ch.bbw.Deadzork.Models;

import java.util.List;

public class Room {
    private String name;
    private Boolean disabled;
    private List<Weapon> weaponList;
    private List<Zorkies> zorkiesList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public List<Zorkies> getZorkiesList() {
        return zorkiesList;
    }

    public void setZorkiesList(List<Zorkies> zorkiesList) {
        this.zorkiesList = zorkiesList;
    }

    public void removeWeapon(Weapon weapon) {
        this.weaponList.remove(weapon);
    }
}
