package abstret;

class Jeux extends Abonnement{
	private int nbjeuxinclus;
	private int heursjeuxparmois;
	public Jeux(String nom, double prixBase, int nbProfils, int nbJeuxInclus, int heuresJeuParMois) {
        super(nom, prixBase, nbProfils);
        this.nbjeuxinclus = nbJeuxInclus;
        this.heursjeuxparmois = heuresJeuParMois;
    }
	 public double calculerCoutMensuel() {
	        double total = getPrixBase();
	        if(nbjeuxinclus > 50) total += 25;
	        if(heursjeuxparmois > 40) total += 15;
	        return total;
	    }
	 public int calculerScoreSatisfaction() {
	        int score = 40;
	        if(nbjeuxinclus >= 30) score += 20;
	        if(heursjeuxparmois >= 20) score += 20;
	        if(getNbProfils() >= 2) score += 10;
	        return Math.min(score, 100);
	    }
	

	

}
