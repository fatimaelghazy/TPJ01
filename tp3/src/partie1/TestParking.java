package partie1;

public class TestParking {
    public static void main(String[] args) {

        
        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("A1", "Toyota", 4);
        v[1] = new Voiture("B2", "BMW", 2);
        v[2] = new Moto("C3", "Yamaha", true);
        v[3] = new Camion("D4", "Volvo", 12000);

        
        for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
            System.out.println("---------------");
        }

     
        System.out.println("=== Les voitures ===");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
            }
        }

      
        Vehicule x = new Moto("11C22", "Yamaha", true);

       //correction 
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : impossible de convertir Moto en Voiture");
        }
    }
}
