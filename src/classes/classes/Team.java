package classes.classes;

public class Team {
    private Lid[] leden;

    public Team(Lid[] leden) {
        this.leden = leden;
    }

    public int getAantalLeden() {
        return leden.length;
    }

    public Lid[] getLeden() {
        return leden;
    }

    public void setLeden(Lid[] leden) {
        this.leden = leden;
    }

    public void printLeden() {
        for(int i = 0; i < leden.length; i++) {
            leden[i].print();
        }
    }
}
