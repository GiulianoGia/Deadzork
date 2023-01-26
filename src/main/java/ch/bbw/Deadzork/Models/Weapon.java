package ch.bbw.Deadzork.Models;

public class Weapon extends Subject{
    private Integer damage;

    public Weapon(String name, Integer weight, Integer level, Integer damage) {
        super(name, weight, level);
        this.damage = damage;
    }

    public Weapon() {
        super();
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name=" + getName() +
                ", damage=" + damage +
                ", weight=" + getWeight() +
                '}';
    }
}
