package runnable;

public class MyRunnable implements Runnable{

	int c , n = 50 ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.println("Run method executed by Thread "+ Thread.currentThread().getName());
			for(int i = 0 ; i < n ; i++){
				 c =  c + i ; 
			}
			Thread.sleep(100);
			System.out.println("Cumulative total of values : "+ c);
		}
		catch(Exception e){
			System.out.println("Interrupted Thread : " + Thread.currentThread().getName());
			//e.printStackTrace();
			return;
		}	
	}
}
