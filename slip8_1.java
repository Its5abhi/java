
public class slip8_1 extends Thread{
	int n;
	String s1;
    slip8_1(String s1,int n){
    	this.n=n;
    	this.s1=s1;
    }
    public void run() {
    	try {

    		for (int i = 1; i <=n; i++) {
	    Thread.sleep(500);		
    	System.out.println(s1);
     }			
		} catch (Exception e) {
		    System.out.println(e);
		}

   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        slip8_1 t1=new slip8_1("Covid19",10);
        slip8_1 t2=new slip8_1("Lockdown",20);
        slip8_1 t3=new slip8_1("Vaccinated",30);
	    t1.start();
	    t2.start();
	    t3.start();
	}

}
