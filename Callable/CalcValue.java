package callable;

import java.util.concurrent.Callable;

public class CalcValue implements Callable{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int c = 1 ;
		try {
			System.out.println("Task is executed by Thread "+Thread.currentThread().getName());
			for(int i = 1 ; i <= 10 ; i++){
				c = c * i ;
			}
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		return c;
	}
	
}
