package demos;
public class ThreadDemo extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getId()+" Value : "+i);
		}
		
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
		
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		
		t1.start();
		t2.start();
	}

}
