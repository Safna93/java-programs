package demos;

public class RunnableSyncDemo implements Runnable {
	
	public void run()
	{
	   synchronized (this) //for to order the thread
{
		
	
		System.out.print("[Hello ");
		
		for(int i=1;i<=4;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("Java]");
	   }
	}
	
	public static void main(String[] args) {
		
		RunnableSyncDemo obj=new RunnableSyncDemo();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.start();
		t2.start();
	}
// [Hello Java]
	
	
}
