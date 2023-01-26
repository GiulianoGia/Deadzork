package ch.bbw.Deadzork.Models;

import java.util.List;

public class Zorkie {
    private Integer level;
    private Integer health;
    private List<Subject> itemsOnZorkie;


    public Zorkie(Integer level, Integer health, List<Subject> itemsOnZorkie) {
        this.level = level;
        this.health = health;
        this.itemsOnZorkie = itemsOnZorkie;
    }


    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public List<Subject> getItemsOnZorkie() {
        return itemsOnZorkie;
    }

    public void setItemsOnZorkie(List<Subject> itemsOnZorkie) {
        this.itemsOnZorkie = itemsOnZorkie;
    }
}
