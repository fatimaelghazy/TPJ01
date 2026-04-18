package abstret;

abstract class Abonnement{
	private String nom;
	private double PrixBase;
	private int nbprofile;
	public Abonnement(String nom,double PrixBase,int nbprofils){
		this.nom=nom;
		this.PrixBase = (PrixBase <= 0) ? 50 : PrixBase;
        this.nbprofile = (nbprofils <= 0) ? 1 : nbprofils;
	}
	public String getNom() { return nom; }
    public double getPrixBase() { return PrixBase; }
    public int getNbProfils() { return nbprofile; }

    public void setNom(String nom) { this.nom = nom; }
    public void setPrixBase(double prixBase) { this.PrixBase = prixBase; }
    public void setNbProfils(int nbProfils) { this.nbprofile = nbProfils; }

	 public boolean estPartageFamilial() {
	        return nbprofile >= 3;
	    }
	public void afficher() {
		System.out.print("le nom");
		System.out.println("le prais de base"+PrixBase);
		System.out.println(+nbprofile);
		System.out.println("Partage familial: " + estPartageFamilial());
		
	}
	 public abstract double calculercoutMensuel();
	    public abstract int calculerscoreSatisfaction();

	

	}
