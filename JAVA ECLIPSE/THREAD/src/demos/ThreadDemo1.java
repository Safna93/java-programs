package demos;

public class ThreadDemo1 implements Runnable

{
	public void run()
	{
		Thread t1=Thread.currentThread();
		Thread t2=Thread.currentThread();
		
			//for(int i=1;i<=10;i++)
			{
				//System.out.println(Thread.currentThread().getId()+" Value : "+i);
	
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
  	
	public static void main(String[] args)

	{
		Thread t1=new Thread(new ThreadDemo1());
		Thread t2=new Thread(new ThreadDemo1());
		t1.start();
	
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
         
		
		try {
			if(!t1.isAlive())
			{
			t2.join();
			System.out.println("T2 joined");
			}
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	}

}
