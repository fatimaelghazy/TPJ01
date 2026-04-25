package partie1;

public class Etudiant {

private String nom;
private int ID;
private int Moyenne;
public  Etudiant(String nom,int ID,int Moyenne) {
	this.nom=nom;
	this.ID=ID;
	this.Moyenne=Moyenne;
}

public String getnom() {return nom;}
public int getID() {return  ID;}
public int getMoyenne() {return Moyenne;}

public void setNom(String nom) { this.nom =nom; }
public void setID(int ID) { this.ID = ID; }
public void setMoyenne(int Moyenne) { this.Moyenne=Moyenne;}
}