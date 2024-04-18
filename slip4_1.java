import java.awt.*;
class blink extends Frame implements Runnable
{
	Label l1;
	Thread th=new Thread(this);
	int n=1;
 	blink(){
 		setVisible(true);
 		setSize(500,500);
 		setLayout(new FlowLayout());
 		
 		l1=new Label("Blink The Text");
 		add(l1);
 		
 		th.start();
 	}
	
	public void run() {
		while(true) {
			
		if(n%2==0) {
			l1.setVisible(false);
		}
		else {
			l1.setVisible(true);
		}
		try {
		Thread.sleep(1000);
		n++;
		}catch(Exception e) {}
	}
 }
}

public class slip4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new blink();
       
	}

}
