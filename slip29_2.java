import java.util.*;

public class slip29_2{
	public static void main(String args[]) {
		int a[]=new int[50];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			
			int num=a[i]%10;
			if(num==5) {
				System.out.println(a[i]);
			}
			
		}
		
		
	}
}