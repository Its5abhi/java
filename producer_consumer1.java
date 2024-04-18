
public class producer_consumer1 extends Thread{
     String name;
     int n;
	 producer_consumer1(String name,int n){
		 this.name=name;
		 this.n=n;
	 }
	synchronized public void run() {
		 System.out.println(name +":"+n);
		 notify();
	 }
	 
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		for (int i = 0; i <=5; i++) {
		 producer_consumer1 p=new  producer_consumer1("Producer",i);   
	     p.start();
	     synchronized(p){
	    	p.wait();
	     }
	     producer_consumer1 c=new producer_consumer1("Consumer",i);
	     c.start();
	     synchronized(c) {
	    	 c.wait();
	     }
	     
	 }
		}
	

}
