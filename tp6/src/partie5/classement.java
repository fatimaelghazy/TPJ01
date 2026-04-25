package partie5;
import java.util.*;
public class classement {
	public static void main(String[]args){
		TreeMap<Integer,String> etudiant= new TreeMap<>();
		etudiant.put(104,"Amine");
		etudiant.put(12,"Sara");
		etudiant.put(13,"Zaineb");
		System.out.println("Liste triée:");
		for(Map.Entry<Integer,String>e:etudiant.entrySet());
		System.out.println(e.getKey() + ":" + e.getValue());
		System.out.println("premier"+ etudiant.firstEntry());
		System.out.println("diriner"+ etudiant.lastEntry());
		System.out.println("ID>100");
		for(Map.Entry<Integer,String> e:etudiant.tailMap(101).entrySet()) {
			System.out.println(e);
		}
		
	}

}