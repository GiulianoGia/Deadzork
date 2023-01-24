package ch.bbw.Deadzork.Models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String username;
    private List<Weapon> inventory;
    private Integer life;
    private Integer maxWeight;
    private Integer currentWeight;

    public Player(String username) {
        this.username = username;
        this.life = 100;
        this.maxWeight = 30;
        this.currentWeight = 0;
        this.inventory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Weapon> getInventory() {
        return inventory;
    }

    public void setInventory(List<Weapon> inventory) {
        this.inventory = inventory;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     *
     * @param subject The Item the user collects
     * Adds a Subject to the User's Inventory
     */
    public void addSubjectToInventory(Weapon subject) {
        this.currentWeight += subject.getWeight();
        if (this.currentWeight <= this.maxWeight) {
            this.inventory.add(subject);
        } else {
            this.currentWeight -= subject.getWeight();
        }
    }

    /**
     *
     * @param id The Id of the Subject
     * Removes the Subject from the inventory
     */
    public void removeSubjectFromInventoryWithId(Integer id) {
        Subject subject = this.inventory.get(id);
        if (subject != null) {
            this.inventory.remove(id);
            this.currentWeight -= subject.getWeight();
        }
    }

    /**
     *
     * @param subject The Subject
     * Removes the Subject from the inventory
     */
    public void removeSubjectFromInventoryWithSubject(Subject subject) {
        if (subject != null) {
            this.inventory.remove(subject);
            this.currentWeight -= subject.getWeight();
        }
    }

    /**
     * shows all the Subject an User has
     */
    public void showInventory() {
        System.out.println("Your inventory:");
        if (inventory.size() > 0) {
            for (Subject subject : inventory) {
                System.out.println(subject.toString());
            }
        } else {
            System.out.println("Your inventory is empty");
        }
    }

    /**
     *
     * @param damage The damage the user gets
     * @return The remaining life
     */
    public Integer lowerLife(Integer damage) {
        if (life >= 1) {
            this.life -= damage;
        }
        return this.life;
    }

    /**
     *
     * @param regeneration How much the user heals
     * @return The remaining life
     */
    public Integer healLife(Integer regeneration) {
        this.life += regeneration;
        return this.life;
    }
}
