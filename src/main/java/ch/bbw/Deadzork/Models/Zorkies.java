package ch.bbw.Deadzork.Models;

import java.util.List;

public class Zorkies {
    private Integer level;
    private Integer life;
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

    public List<Key> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<Key> keyList) {
        this.keyList = keyList;
    }
}
