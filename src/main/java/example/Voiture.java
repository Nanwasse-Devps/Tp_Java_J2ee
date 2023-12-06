package example;

public class Voiture extends Vehicule {
    private double nombrePlaces;

    public Voiture(String nom, double poids, double prix, double vitesse) {
        super(nom, poids, prix, vitesse);
    }

    public double getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(double nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public void demarrer() {
        System.out.println("La voiture démarre !");
    }
}
