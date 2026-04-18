package abstret;

 public  class vidio extends Abonnement implements Inter{
	 private boolean optionHD;
	    private boolean option4K;

	    public vidio(String nom, double prixBase, int nbProfils, boolean optionHD, boolean option4K) {
	        super(nom, prixBase, nbProfils);
	        this.optionHD = optionHD;
	        this.option4K = option4K;
	    }
	    public double calculercoutMensuel() {
	        double total = getPrixBase();
	        if(optionHD) total += 10;
	        if(option4K) total += 20;
	        return total;
	    }
	    public int calculerscoreSatisfaction() {
	        int score = 60;
	        if(optionHD) score += 10;
	        if(option4K) score += 20;
	        if(getNbProfils() >= 4) score += 10;
	        return Math.min(score, 100);
	    }
	    public boolean estEligibleReduction(double p) {
	        return p <= 30;
	    }
	    public double appliquerReduction(double p) {
	        if(estEligibleReduction(p)) {
	            return calculercoutMensuel() * (1 - p/100);
	        }
	        return calculercoutMensuel();
	    }
 }	