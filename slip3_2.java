import java.util.*;
public class slip3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		LinkedList<String> l1=new LinkedList<String>();
	     l1.add("Abhi");
	     l1.add("AbhiVetal");
	     l1.add("Jay Shri Ram");
	      l1.addLast("RBNB");
	      l1.removeFirst();
	    System.out.println("Reverse Order=");  
	     for (int i = l1.size()-1; i >=0 ; i--) {
			System.out.println(l1.get(i));
		} 
	     
	}

}
