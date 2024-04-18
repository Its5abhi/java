import java.util.Scanner;

public class slip23_1 extends Thread{
	String s1;
	 slip23_1(String s1){
		 this.s1=s1;
		 
		 start();
	 }

	 public void run() {
		 
		 for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' ||s1.charAt(i)=='i' ||s1.charAt(i)=='o' ||s1.charAt(i)=='u' ) {
				
				try {
					Thread.sleep(3000);
					System.out.println(s1.charAt(i));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String");
	    String s1=sc.next();
	
	   new slip23_1(s1);
	}

}
