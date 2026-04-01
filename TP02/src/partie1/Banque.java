package partie1;

public class Banque {

    private String nom ;
    private comptebancaire[] comptes;
    private int nbActuels;

    // Constructeur
    public Banque(String nom, int capacite) {
        this.nom = nom;
        this.comptes = new comptebancaire[capacite];
        this.nbActuels = 0;
    }

    // Ajouter compte
    public void ajouterCompte(comptebancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels++] = c;
        } else {
            System.out.println("Banque pleine !");
        }
    }

    // Afficher tous les comptes
    public void afficherTous() {
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
}