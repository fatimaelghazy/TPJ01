package partie3;
import java.util.*;
public class Matiére {

	public static void main(String[] args) {
		HashSet<String>matieres=new HashSet<>();
		matieres.add("Math");
		matieres.add("java");
		matieres.add("Arab");
		matieres.add("java");
		System.out.println("HashSet"+ matieres);
		TreeSet<String> tri=new TreeSet<>(matieres);
		System.out.println("Trie:"+ tri);

	}

}
