package Model.entity;

public class VGame extends Favourite {
    private String company;
    private String type;

    public VGame() {
        super();
        company="";
        type="";
    }

    public VGame(String company, String type) {
        this.company = company;
        this.type = type;
    }

    public VGame(String id, String name, double duration, String company, String type) {
        super(id, name, duration);
        this.company = company;
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VGame[company=" + company + "type=" + type + "]"+super.toString();
    }
}