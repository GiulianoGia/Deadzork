package ch.bbw.Deadzork.Models;

public class Key extends Subject{
    private Boolean status;

    public Key(String name, Integer weight, Integer level, Boolean status) {
        super(name, weight, level);
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
