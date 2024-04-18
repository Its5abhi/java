import java.util.*;
public class slip19_1 {
   
	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		
		l1.push(10);
		l1.add(44);
		l1.add(-66);
		l1.add(50);
		l1.add(-40);
		
		System.out.println("Negetive Numbers=");
		for(int i=0;i<l1.size();i++) {
			int num=l1.get(i);
			if(num<0) {
				System.out.println(num);
			}
		}
	}
}
