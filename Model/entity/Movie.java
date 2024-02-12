package Model.entity;

public class Movie extends Favourite {
    private String director;
    private String gender;

    public Movie(String director, String gender) {
        this.director = director;
        this.gender = gender;
    }
    public Movie() {
        super();
        director="";
        gender="";
    }

    public Movie(String id, String name, double duration, String director, String gender) {
        super(id, name, duration);
        this.director = director;
        this.gender = gender;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Movie[director=" + director +  "gender=" + gender + super.toString() + "]";

    }
}