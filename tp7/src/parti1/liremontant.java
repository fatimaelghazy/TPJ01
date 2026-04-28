package parti1;
public class liremontant{
public  double liremontant (String valeur) {
	
	
	try {
		double montant= Double.parseDouble(valeur);
		if(montant<0) {
			throw new Exception("montant négatif");
		}
		return montant;
	}
	catch (numformatException e) {
		System.out.println("erreur la valeur n'est pas numerique");
		return 0;
	}
    catch (Exception e) {
    	System.out.println("erreur"+ e.getMessage());
    	return 0;
    }
	
	
}
}
