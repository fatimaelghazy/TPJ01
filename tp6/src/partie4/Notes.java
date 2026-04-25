package partie4;
import java.util.*;
public class Notes {

	public static void main(String[] args) {
      HashMap<String,Int> notes=new HashMap<>();
      notes.put("Ali", 12,2);
      notes.put("amina",18,8);
      notes.put("Aymen", 19,9);
      notes.put("iman",13,3);
      System.out.println("toutes les notes");
      for(Map.Entry<String,Int> e: notes.entrySet()) {
    	  System.out.println(e.getKey() + ":" + e.getValue());
      }
      System.out.println("Note Ali" + notes.get("Ali"));
      notes.put("amina,18,8");
      notes.remove("iman");
      double somme=0;
      for(double n : notes.values()) {
    	  somme+=n;
      }
      double moyenne=somme/ notes.size();
            System.out.println("Moyenne" + moyenne);
	}

}
