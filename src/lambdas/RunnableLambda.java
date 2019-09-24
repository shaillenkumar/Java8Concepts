package lambdas;

public class RunnableLambda {

	public static void main(String[] args) {

		//legacy way of creating Threads using Runnable Interface
		Runnable runnable1 = new Runnable(){
			@Override
			public void run(){
				System.out.println("Inside Runnable");
			}
		};
		new Thread(runnable1).start();
	
	
	

	//Lambda method of creating Threads using Runnable Interface
	Runnable runnableLambda = () -> System.out.println("Inside Lambda Runnable");
	
	new Thread(runnableLambda).start();
	
	}
}
