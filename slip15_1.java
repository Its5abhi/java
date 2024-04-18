

class A extends Thread{
	Thread th=new Thread();
	A(){
		//th.setName("Abhi");
		//th.setPriority(MAX_PRIORITY);
		
		System.out.println("Thread Name="+th.getName());
		System.out.println("Thread Priority="+th.getPriority());
		
    }
}
public class slip15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A ob=new A();
	}

}
