package ch.bbw.Deadzork.Models;

public class Subject {
    private String name;
    private Integer weight;
    private Integer level;

    public Subject(String name, Integer weight, Integer level) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getLevel() {return level;}

    public void setLevel(Integer level) {this.level = level;}

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", level=" + level +
                '}';
    }
}
