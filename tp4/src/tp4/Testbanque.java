package tp4;

public class Testbanque  {

	public  void main(String[] args) {
		compte[] comptes=new compte[4];
		comptes[0]=new Comptecourant("12","amina",1254,564);
		comptes[1]=new Comptecourant("22","ali",1234,345);
		comptes[2]=new Comptecourant("43","fatima",6785,456);
		comptes[3]=new Comptecourant("23","kamal",6795,234);
		for(compte c:comptes) {
			System.out.printf("les comptes sont",comptes[0],comptes[1],comptes[2],comptes[3]);
			c.deposer(200);
			c.retirer(288);
			c.afficher();
		}
	System.out.println("Comptes epargne");
	for(compte c:comptes) {
		if(c instanceof Compteepargne) {
			c.afficher();
		}
	}
	compte c=new Compteepargne("12","mina",122,23);
	Comptecourant cc=(Comptecourant)c;
		
	}
	

}
