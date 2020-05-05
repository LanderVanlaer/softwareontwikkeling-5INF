package classes.classes;

public class Lid {
    private String naam;
    private String specialiteit;

    public Lid(String naam, String specialiteit) {
        this.naam = naam;
        this.specialiteit = specialiteit;
    }

    public void print() {
        System.out.println("Lid:");
        System.out.println("\t--> Naam: " + this.naam);
        System.out.println("\t--> Specialiteit: " + this.specialiteit);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getSpecialiteit() {
        return specialiteit;
    }

    public void setSpecialiteit(String specialiteit) {
        this.specialiteit = specialiteit;
    }
}
