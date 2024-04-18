import java.awt.*;
public class slip4_11 extends Frame implements Runnable{
	
	Thread th=new Thread(this);
	Label l1;
	int n=1;
	slip4_11(){
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		l1=new Label("Blink the Text");
		add(l1);
		
		th.start();
	}
	
	public void run(){
		while(true) {
		if(n%2==0) {
			l1.setVisible(true);
		}
		else {
			l1.setVisible(false);
		}
		try {
			Thread.sleep(500);
			n++;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
	
    public static void main(String[] args) {
		new slip4_11();
	}
}
