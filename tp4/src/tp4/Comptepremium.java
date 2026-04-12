package tp4;

public class Comptepremium extends compte {
       private double platfondretrait;
       
	public Comptepremium(String numero,String titulaire,double solde,double platfondretrait) {
       super(numero,titulaire,solde);
       this.platfondretrait=platfondretrait;
       

	}
@Override
public void retirer(double retrait) {
	if(retrait<=this.solde) {
		this.solde-=retrait;
		
	}
	else {
		System.out.println("solde insuffisant");
	}
	if(platfondretrait<retrait ) {
	System.out.println("impossible de faire le retrait");
		
	}
}
}