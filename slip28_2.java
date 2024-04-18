
public class slip28_2 implements Runnable{

	public void run() {
	   System.out.println("Corrently Executed Thread="+Thread.currentThread().getName());	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Thread t1=new Thread(new slip28_2(),"Thread1");
		Thread t2=new Thread(new slip28_2(),"Thread2");
		Thread t3=new Thread(new slip28_2(),"Thread3");
		Thread t4=new Thread(new slip28_2(),"Thread4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
