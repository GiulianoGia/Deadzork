package ch.bbw.Deadzork.Models;

import java.util.List;

public class Room {
    private String name;
    private Boolean disabled;
    private List<Subject> weaponList;
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

    public void removeZorkie(Zorkies zorkies) { this.zorkiesList.remove(zorkies);}

    public void addSubject(Subject weapon) { this.weaponList.add(weapon); }
}
