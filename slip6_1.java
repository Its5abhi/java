import java.util.*;
public class slip6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);  
		TreeSet<Integer> t1=new TreeSet<Integer>();
          
          System.out.println("Enter Limit:");
          int n=sc.nextInt();
          
          System.out.println("Enter Number:");
          for (int i = 0; i < n; i++) {
			 t1.add(sc.nextInt());
		   }
          System.out.println("Treeset="+t1);
          System.out.println("Enter Number to search:");
          int num=sc.nextInt();
           
            if(t1.contains(num)) {
            	System.out.println("Number are Present");
          }
            else
            	System.out.println("Number are Not Present");
	}

}
