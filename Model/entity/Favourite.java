package Model.entity;

public class Favourite {
    protected String id;
    protected String name;
    protected double duration;

    public Favourite(String id, String name, double duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public Favourite() {
        this("", "", 0);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Favourite[id=" + id + "name=" + name + "duration=" + duration + "]";
    }

}