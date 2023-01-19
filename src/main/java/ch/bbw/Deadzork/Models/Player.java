package ch.bbw.Deadzork.Models;

import java.util.List;

public class Player {
    private String username;
    private List<Subject> inventory;
    private Integer life;

    public Player(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Subject> getInventory() {
        return inventory;
    }

    public void setInventory(List<Subject> inventory) {
        this.inventory = inventory;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    private void addSubjectToInventory(Subject subject) {
        this.inventory.add(subject);
    }

    private void removeSubjectFromInventoryWithId(Integer id) {
        this.inventory.remove(id);
    }

    private void removeSubjectFromInventoryWithSubject(Subject subject) {
        this.inventory.remove(subject);
    }
}
