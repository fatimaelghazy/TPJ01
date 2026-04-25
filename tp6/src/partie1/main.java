package partie1;
import java.util.*;

public class main {

	public static void main(String[] args) {
		ArrayList<Etudiant>list=new ArrayList<>();
		list.add(new Etudiant("Amine",2,13));
		list.add(new Etudiant("maria",3,12));
		list.add(new Etudiant("Aymen",4,17));
		list.add(new Etudiant("LAMIAA",5,16));
		list.add(new Etudiant("HAna",6,19));
	list.forEach(System.out::println);
	for(Etudiant e: list) {
		if(e.nom.equals("maria")) {
			System.out.println("Trouver:"+e);
		}
	}
	list.removeIf(e-> e.ID==5);
	list.sort(Comparator.comparingInt(e->.Moyenne));
	Etudiant best=Collections.max(list,Comparator.comparingInt(e->.Moyenne));
	System.out.println("meilleur:"+best);
	}

}
