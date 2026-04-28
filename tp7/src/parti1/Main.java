package parti1;

public class Main {

	public static void main(String[] args) {
		shopexpress shop =new shopexpress();
		try {
			double nvsolde=shop.effectuerpaiment(140, 123);
			System.out.println("nouveau solde"+ nvsolde);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			double m=shop.liremontant("aht");
		}
		catch(Exception e) {
			System.out.println("errer géré dans le main"+ e.getMessage());
		}
		finally{
			System.out.println("finn de la transaction");
		}

	}

}
