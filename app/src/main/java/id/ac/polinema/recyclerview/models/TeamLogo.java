package id.ac.polinema.recyclerview.models;

public class TeamLogo {
    private String logo, name;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeamLogo(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }
}