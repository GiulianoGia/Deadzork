package ch.bbw.Deadzork.Models;

import java.util.List;

public class Zorkies {
    private Integer level;
    private Integer life;
    private Integer attack;
    private List<Key> keyList;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public List<Key> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<Key> keyList) {
        this.keyList = keyList;
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
}
