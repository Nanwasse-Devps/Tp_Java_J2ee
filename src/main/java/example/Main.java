package example;


public class Main {
    public static void main(String[] args) {
        // Instanciation d'un Véhicule
        Vehicule vehicule = new Vehicule("Véhicule générique", 1500.0, 20000.0, 120.0);

        // Instanciation d'un Avion
        Avion avion = new Avion("Airbus A320", 73500.0, 50000000.0, 840.0);
        avion.setCapaciteSoute(150000.0); // Définir la capacité de la soute de l'avion

        // Instanciation d'une Voiture
        Voiture voiture = new Voiture("Toyota Corolla", 1200.0, 25000.0, 180.0);
        voiture.setNombrePlaces(5); // Définir le nombre de places dans la voiture

        // Affichage des informations
        afficherInformationsVehicule(vehicule);
        afficherInformationsAvion(avion);
        afficherInformationsVoiture(voiture);

        // Exécution des méthodes
        vehicule.accelerate();
        avion.accelerate();
        voiture.accelerate();
        avion.accelererAvio();
        voiture.demarrer();
    }

    // Méthode pour afficher les informations d'un véhicule générique
    private static void afficherInformationsVehicule(Vehicule vehicule) {
        System.out.println("Nom du véhicule : " + vehicule.getNom());
        System.out.println("Poids du véhicule : " + vehicule.getPoids());
        System.out.println("Prix du véhicule : " + vehicule.getPrix());
        System.out.println("Vitesse maximale du véhicule : " + vehicule.getVitesse());
        System.out.println();
    }

    // Méthode pour afficher les informations d'un avion
    private static void afficherInformationsAvion(Avion avion) {
        afficherInformationsVehicule(avion);
        System.out.println("Capacité de la soute : " + avion.getCapaciteSoute());
        System.out.println();
    }

    // Méthode pour afficher les informations d'une voiture
    private static void afficherInformationsVoiture(Voiture voiture) {
        afficherInformationsVehicule(voiture);
        System.out.println("Nombre de places : " + voiture.getNombrePlaces());
        System.out.println();
    }
}
