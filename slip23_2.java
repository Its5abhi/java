import java.util.*;
public class slip23_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1=new LinkedList<String>();
       
		for (int i = 0; i < args.length; i++) {
		  l1.add(args[i]);	
		}
		
		ListIterator<String> lit =l1.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		Iterator<String> I =l1.iterator();
	   
		while(I.hasNext()) {
	    	System.out.println(I.next());
	    }
	}

}
