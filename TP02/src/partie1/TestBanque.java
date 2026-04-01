package partie1;

public class TestBanque {

    public static void main(String[] args) {

        // 1. Création banque
        Banque b = new Banque("MarocBank", 1500);

        // 2. Création comptes
        comptebancaire c1 = new comptebancaire("Ali", 1000, 500);
        comptebancaire c2 = new comptebancaire("Sara", 2000, 300);
        comptebancaire c3 = new comptebancaire("Youssef", 1500, 400);

        // 3. Ajout à la banque
        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        b.ajouterCompte(c3);

        // 4. Opérations
        c1.deposer(500);
        c1.retirer(1200);
        c2.virementVers(c3, 1000);

        // 5. Affichage
        System.out.println("=== Comptes ===");
        b.afficherTous();

        // 6. Calcul intérêts
        System.out.println("Solde c2 avec intérêts: " + c2.calculerSoldeAvecInterets());
        System.out.println("Solde c2 avec bonus: " + c2.calculerSoldeAvecInterets(0.015));

        // 7. Infos globales
        System.out.println("Nombre total de comptes: " + comptebancaire.getNbComptes());
        System.out.println("Taux d'intérêt annuel: " + comptebancaire.getTauxInteretAnnuel());
    }
}