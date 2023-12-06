package example;

public class Vehicule {
    protected String nom;
    protected double poids;
    protected double prix;
    protected double vitesse;

    public Vehicule(String nom, double poids, double prix, double vitesse) {
        this.nom = nom;
        this.poids = poids;
        this.prix = prix;
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public void accelerate() {
        System.out.println("Le véhicule accélère !");
    }
}
