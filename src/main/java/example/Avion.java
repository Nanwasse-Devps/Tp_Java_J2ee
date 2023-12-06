package example;

public class Avion extends Vehicule {
    private double capaciteSoute;

    public Avion(String nom, double poids, double prix, double vitesse) {
        super(nom, poids, prix, vitesse);
    }

    public double getCapaciteSoute() {
        return capaciteSoute;
    }

    public void setCapaciteSoute(double capaciteSoute) {
        this.capaciteSoute = capaciteSoute;
    }

    public void accelererAvio() {
        System.out.println("L'avion accélère !");
    }
}
