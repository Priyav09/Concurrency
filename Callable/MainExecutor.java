package callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainExecutor {

	public static void main(String args[]){
			
		ExecutorService executors = Executors.newWorkStealingPool(5);
		Future<Integer> future =  executors.submit(new CalcValue());
		try{
			System.out.println("Task is executed by Thread "+Thread.currentThread().getName());
			Thread.sleep(10);
			System.out.println("Is future task completed  "+future.isDone());
			System.out.println("Future value : " + future.get()); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		if(executors.isShutdown() == false) {
			System.out.println("Shuting down executor service " );
			executors.shutdown();
		}
	}
}
