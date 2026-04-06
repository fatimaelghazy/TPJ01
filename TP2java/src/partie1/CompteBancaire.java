
public class CompteBancaire {
	

    // Attributs privés
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

    // Attributs statiques
    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03;

    // Constructeur par défaut
    public CompteBancaire() {
        this.numero = ++nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    // Constructeur paramétré
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        this.numero = ++nbComptes;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    // Getters & Setters avec validation
    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty()) {
            this.titulaire = titulaire;
        }
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise >= 0) {
            this.decouvertAutorise = decouvertAutorise;
        }
    }

    public double getSolde() {
        return solde;
    }

    public int getNumero() {
        return numero;
    }

    // Affichage
    public void afficher() {
        System.out.println("Compte N°: " + numero +
                ", Titulaire: " + titulaire +
                ", Solde: " + solde +
                ", Découvert: " + decouvertAutorise);
    }

    // Déposer
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }

    // Retirer
    public void retirer(double montant) {
        if (montant > 0 && (solde + decouvertAutorise) >= montant) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé.");
        }
    }

    // Virement
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && (solde + decouvertAutorise) >= montant) {
            this.solde -= montant;
            autre.solde += montant;
        } else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }

    // Calcul intérêts (sans paramètre)
    public double calculerSoldeAvecInterets() {
        solde += solde * tauxInteretAnnuel;
        return solde;
    }

    // Calcul intérêts (avec bonus)
    public double calculerSoldeAvecInterets(double bonus) {
        solde += solde * (tauxInteretAnnuel + bonus);
        return solde;
    }

    // Méthodes statiques
    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double taux) {
        tauxInteretAnnuel = taux;
    }
}