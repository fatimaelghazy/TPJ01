package partie2;
import java.util.*;
public class Attent {

	public static void main(String[] args) {
    LinkedList<String> file= new LinkedList<>();
    file.add("client 1");
    file.add("client 2");
    file.add("client 3");
    System.out.println(file);
    System.out.println("Premier:"+file.peek());
    file.addLast("client4");
    System.out.println("Tete:"+ file.getFirst());
    		
	}

}
