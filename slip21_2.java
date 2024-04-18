class cp extends Thread
{
	String name;
	int n;
	cp(String name,int n)
	{
		this.name=name;
		this.n=n;
	}
	
	synchronized public void run()
	{
		System.out.println(name+" : "+n);
		notify();
		
	}
}

public class slip21_2
{
	public static void main(String arg[])
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				cp p=new cp("producer", i);
				p.start();
				synchronized (p)
				{
					p.wait();
				}
				
				cp c=new cp("consumer", i);
				c.start();
				synchronized (c)
				{
					c.wait();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}