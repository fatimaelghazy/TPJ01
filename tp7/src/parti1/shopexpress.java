package parti1;

public class shopexpress {

	public double effectuerpaiment(double montant,double solde) throws Exception {
		if(montant<=0) {
			throw new Exception("ereur le mantant doit etre supérieur a zero");
		}
		if(montant>solde) {
			throw new Exception("solde insufaisent");
		}
		return solde-montant;

	}

	public double liremontant(String string) {
		
		return 0;
	}
	

}
