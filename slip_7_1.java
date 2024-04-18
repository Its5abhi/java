import java.util.*;

public class slip_7_1 extends Thread{

	public slip_7_1() {
		// TODO Auto-generated constructor stub
	   start();
	}
	public void run() {
	   	try {
			
	   		while(true) {
	   			Random r1=new Random();
	   			int n=r1.nextInt(100);
	   			sleep(1000);
	   			if(n%2==0) {
	   				new Thread2(n);
	   			}
	   			else {
	   				new Thread3(n);
	   			}
	   			
	   		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         slip_7_1 ob=new slip_7_1();
	}
}

class Thread2 extends Thread{
	int n;
	Thread2(int n){
		this.n=n;
		start();
	}
	public void run() {
		System.out.println("Square="+n*n);
	}
}

class Thread3 extends Thread{
	int n;
	Thread3(int n){
		this.n=n;
		start();
	}
	public void run() {
		System.out.println("cube="+n*n*n);
	}
}