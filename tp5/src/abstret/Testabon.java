package abstret;

public class Testabon {
    public static void main(String[] args) {

        Abonnement[] abonnements = {
            new video("egybest", 100, 4, true, true),
            new Musique("musiqueon", 50, 2, 25, true),
            new Jeux("angelda", 80, 3, 60, 50)
        };

        for(Abonnement a : abonnements) {
            System.out.println("------");
            a.afficher();
            System.out.println("Cout: " + a.calculercoutMensuel());
            System.out.println("Score: " + a.calculerscoreSatisfaction());
        }

        Inter[] reducibles = {
            new video("egybest", 100, 4, true, true);
            new Musique("musiqueon", 50, 2, 25, true);
        };

        for(Inter r : reducibles) {
            System.out.println("------ Reduction ------");
            System.out.println("20%: " + r.appliquerreduction(20));
            System.out.println("50%: " + r.appliquerreduction(50));
        }
    }
}


