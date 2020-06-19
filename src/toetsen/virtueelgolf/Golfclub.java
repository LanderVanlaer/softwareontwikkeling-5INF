package toetsen.virtueelgolf;

public class Golfclub {
    private String merk;
    private int sterkte;

    public Golfclub() {
        this("Getogolf", 150);
    }

    public Golfclub(String merk, int sterkte) {
        this.merk = merk;
        this.sterkte = sterkte;
    }

    public double getSterkteSlag() {
        return this.getSterkte() + (this.getSterkte() * .25) * Math.random() * (Math.random() < .5 ? -1 : 1);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getSterkte() {
        return sterkte;
    }

    public void setSterkte(int sterkte) {
        this.sterkte = sterkte;
    }
}
