package abstret;

class Musique extends Abonnement implements Inter{
	private int nbplaylistes;
	private boolean optionoffline;
	public Musique(String nom, double prixBase, int nbProfils, int nbPlaylists, boolean optionOffline) {
        super(nom, prixBase, nbProfils);
        this.nbplaylistes = nbPlaylists;
        this.optionoffline = optionOffline;
    }
	public double calculerCoutMensuel() {
        double total = getPrixBase();
        if(optionoffline) total += 15;
        return total;
    }
	 public int calculerScoreSatisfaction() {
	        int score = 50;
	        if(nbplaylistes > 20) score += 20;
	        if(optionoffline) score += 20;
	        if(getNbProfils() > 1) score += 10;
	        return Math.min(score, 100);
	    }
	 public boolean estEligibleReduction(double p) {
	        return p <= 30;
	    }
	 public double appliquerReduction(double p) {
	        if(estEligibleReduction(p)) {
	            return calculerCoutMensuel() * (1 - p/100);
	        }
	        return calculerCoutMensuel();
	    }
	

}
