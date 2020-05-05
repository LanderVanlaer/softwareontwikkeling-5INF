package classes.classes;

public class FxRechthoek {
    private double hoogte;
    private double basis;
    private Coordinates pos;

    public FxRechthoek(double basis, double hoogte) {
        this.hoogte = hoogte;
        this.basis = basis;
    }

    public FxRechthoek(double basis, double hoogte, double x, double y) {
        this.hoogte = hoogte;
        this.basis = basis;
        this.setMiddelPunt(x, y);
    }

    public FxRechthoek(double basis, double hoogte, Coordinates coordinates) {
        this.hoogte = hoogte;
        this.basis = basis;
        this.pos = coordinates;
    }

    public boolean isVierkant() {
        return this.hoogte == this.basis;
    }

    public double getOppervlakte() {
        return this.hoogte * this.basis;
    }

    public void setMiddelPunt(double x, double y) {
        setMiddelPunt(new Coordinates(x, y));
    }

    public Coordinates getMiddelPunt() {
        return pos;
    }

    public void setMiddelPunt(Coordinates coordinates) {
        this.pos = coordinates;
    }

    public boolean bevatPunt(double x, double y) {
        return this.bevatPunt(new Coordinates(x, y));
    }

    public boolean bevatPunt(Coordinates coordinates) {
        return (coordinates.getX() >= this.getMiddelPunt().getX() - this.getBasis() / 2D) &&
                (coordinates.getX() <= this.getMiddelPunt().getX() + this.getBasis() / 2D) &&
                (coordinates.getY() >= this.getMiddelPunt().getY() - this.getHoogte() / 2D) &&
                (coordinates.getY() <= this.getMiddelPunt().getY() + this.getHoogte() / 2D);
    }

    public boolean groterDan(FxRechthoek andereRechthoek) {
        return andereRechthoek.getOppervlakte() < this.getOppervlakte();
    }


    public double getHoogte() {
        return hoogte;
    }

    public void setHoogte(double hoogte) {
        this.hoogte = hoogte;
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
    }
}
