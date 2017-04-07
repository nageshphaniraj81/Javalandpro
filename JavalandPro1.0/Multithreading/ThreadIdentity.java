

public class ThreadIdentity extends Thread{

	public static void main(String[] args)throws InterruptedException {
		
		ThreadIdentity jd = new ThreadIdentity();
		jd.start();
		
		Thread t = Thread.currentThread();
		System.out.println("Name of the current thread is "+t.getName());

	}

	@Override
	public void run() {
		
		Thread t1 = Thread.currentThread();
		System.out.println("Name of the child thread is "+t1.getName());
		t1.setName("Child thread");
		System.out.println("Name of the child thread is "+t1.getName());

	}

}
