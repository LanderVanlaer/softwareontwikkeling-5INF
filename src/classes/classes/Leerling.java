package classes.classes;

public class Leerling {
    private String voorNaam;
    private String achterNaam;
    private String klas;

    public Leerling(String voorNaam, String achterNaam, String klas) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.klas = klas;
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public String getKlas() {
        return klas;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }
}
