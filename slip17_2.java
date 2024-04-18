import java.awt.event.*;
import java.awt.*;
 class slip17_2 extends Frame implements Runnable,ActionListener {
    Thread th=new Thread(this);
	 TextField t1;
	 Button b1;
    slip17_2(){
    	setVisible(true);
    	setSize(500,500);
    	setLayout(new FlowLayout());
    	
    	t1=new TextField(10);
    	b1=new Button("Start");
    	
    	add(t1);add(b1);
    	
    	b1.addActionListener(this);
    }
    
    public void run() {
    	 for(int i=1;i<=100;i++) {
    		 try {
				Thread.sleep(1000);
				t1.setText(""+i);
    			 
			} catch (Exception e) {
				System.out.println(e);
			}
    	 }
    }
    
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource()==b1) {
    	    th.start();	
    	}
    	
    }
	public static void main(String[] args) {
		  slip17_2 ob=new slip17_2();
		  
	}

}
