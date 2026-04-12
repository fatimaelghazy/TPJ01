package tp4;

public class Comptecourant extends compte {
	private double decouverautoriser;
	
	public Comptecourant(String numero,String titulaire,double solde,double decouverautoriser) {
		super(numero,titulaire,solde);
		this.decouverautoriser=decouverautoriser;
	}
   @Override
   public void retirer(double retrait) {
	   if(retrait<=solde+decouverautoriser) {
		   solde-=retrait;
	   }
	   else {
		   System.out.println("dépassement de découver");
	   }
   }
	@Override
	public void afficher() {
		super.afficher();
		System.out.printf("le decouvert autoriser",+decouverautoriser);
	}
}
