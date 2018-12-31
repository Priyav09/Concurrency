package runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(5); 
		executorService.execute(new MyRunnable());
				
		System.out.println(Thread.currentThread().getName() + "  thread is going to sleep ");
		try{
		Thread.sleep(100);
		}
		catch(InterruptedException e){
			
			e.printStackTrace();
		}
		System.out.println("shutting down the executor Service");
		executorService.shutdownNow();
	}

}
