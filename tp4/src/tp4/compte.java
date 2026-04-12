package tp4;


public class compte {

	protected String numero;
	protected String titulaire;
	protected double solde;
	
	public compte(String numero,String titulaire,double solde) {
		this.numero=numero;
		this.titulaire=titulaire;
		this.solde=solde;
	}
public void deposer(double montant) {
	this.solde+=montant;
}
public void retirer(double retrait) {
	if(retrait<=this.solde) {
		this.solde-=retrait;
	}
	else {
		System.out.println("solde insufaisent");
	}
}
public void afficher() {
	System.out.println("le numero de commpte est"+this.numero);
	System.out.println("le titulaire de commpte est"+this.titulaire);
	System.out.println("le solde de commpte est"+this.solde);
}
}
