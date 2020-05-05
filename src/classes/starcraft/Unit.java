package classes.starcraft;

public class Unit {
    private double levensbar;
    private double speed;
    private double attack;
    private double armor;
    private double aanvalssnelheid;

    public Unit(double levensbar, double speed, double attack, double armor, double aanvalssnelheid) throws Exception {
        if(levensbar <= 0 || speed <= 0 || attack <= 0 || armor < 0 || aanvalssnelheid <= 0)
            throw new Exception("Slechte input waarden in constructor");

        this.levensbar = levensbar;
        this.speed = speed;
        this.attack = attack;
        this.armor = armor;
        this.aanvalssnelheid = aanvalssnelheid;
    }


    public void attack(Unit attacker) throws InterruptedException {
        while(this.getLevensbar() > 0 && attacker.getLevensbar() > 0) {
            System.out.println("------------------------------------------------");
            //attacker valt aan
            this.printGegevensAttack("Verdediger");
            attacker.printGegevensAttack("Aanvaller");

            Thread.sleep((long) (attacker.getAanvalssnelheid() * 1000L));
            this.hit(attacker.getAttack());

            System.out.println("------------------------------------------------");
            if(!(this.getLevensbar() > 0 && attacker.getLevensbar() > 0))
                break;
            attacker.printGegevensAttack("Verdediger");
            this.printGegevensAttack("Aanvaller");
            //verdediger valt aan
            Thread.sleep((long) (this.getAanvalssnelheid() * 1000L));
            attacker.hit(this.getAttack());
        }
        //1 van de 2 is dood
    }

    private void printGegevensAttack(String attackVerdediger) {
        System.out.println("\n" + attackVerdediger + ":");
        System.out.println(" -->\tHP: " + this.getLevensbar());
        System.out.println(" -->\tAanvalssnelheid: " + this.getAanvalssnelheid());
        System.out.println(" -->\tAttack: " + this.getAttack());
        System.out.println(" -->\tSpeed: " + this.getSpeed());
    }

    public void hit(double attack) {
        double lifelos = attack - this.getArmor();
        if(lifelos <= 0)
            lifelos = 0;
        this.levensbar -= lifelos;
    }


    public double getLevensbar() {
        return levensbar;
    }

    public void setLevensbar(double levensbar) {
        this.levensbar = levensbar;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getAanvalssnelheid() {
        return aanvalssnelheid;
    }

    public void setAanvalssnelheid(double aanvalssnelheid) {
        this.aanvalssnelheid = aanvalssnelheid;
    }
}
