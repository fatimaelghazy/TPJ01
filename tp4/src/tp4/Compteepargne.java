package tp4;

public class Compteepargne extends compte {
	 private double tauxinteret;
	 public Compteepargne(String numero,String titulaire,double solde,double tauxinteret) {
		 super(numero,titulaire,solde);
		 this.tauxinteret=tauxinteret;
	 }
	 public void calculerinteret() {
		 solde+=solde*tauxinteret;
	 }
@Override
public void retirer(double retrait) {
	if(retrait<=solde) {
		this.solde-=retrait;
	
	}
	else {
		System.out.println("le solde est insifisant");
	}
	
}
}