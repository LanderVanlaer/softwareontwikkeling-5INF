package toetsen.virtueelgolf;

import classes.classes.Coordinates;

public class Golfbal {
    private String merk;
    private Coordinates pos;

    public Golfbal(String merk){
        this.merk = merk;
    }

    public Golfbal(String merk, Hole hole) {
        this.merk = merk;
        this.pos = new Coordinates(hole.getStartPos());
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void print() {
        System.out.println(this.getMerk() + "\tPos: (" + this.getPos().getX() + ", " + this.getPos().getY() + ")");
    }

    public Coordinates getPos() {
        return pos;
    }

    public void setPos(Coordinates pos) {
        this.pos = pos;
    }
}
