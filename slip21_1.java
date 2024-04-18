import java.util.*;
public class slip21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> l1=new LinkedList<Integer>();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter N Numbers");
       for (int i = 0; i < 5; i++) {
		  
    	   int num=sc.nextInt();
    	   l1.add(num);
	  }
       ListIterator<Integer> lit=l1.listIterator();
       
       while(lit.hasNext()) {
    	   System.out.println(lit.next());
       }
	}

}
