
public class ThreadPriorityDemo extends Thread{

	public static void main(String[] args) {

		//Order is not guaranteed
		ThreadPriorityDemo td = new ThreadPriorityDemo();
		
		td.setPriority(1);
		td.setName("TD");
        td.start();
        
		ThreadPriorityDemo td1 = new ThreadPriorityDemo();

		td.setPriority(2);
		td1.setName("TD1");
        td1.start();
        
		ThreadPriorityDemo td2 = new ThreadPriorityDemo();
	
		td.setPriority(3);
		td2.setName("TD2");
        td2.start();

	}
	
	public void run(){
		System.out.println("Thread name is : "+Thread.currentThread().getName());
	}

}
