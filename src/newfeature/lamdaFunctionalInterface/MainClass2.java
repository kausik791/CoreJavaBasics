package newfeature.lamdaFunctionalInterface;

public class MainClass2 {
	public static void main(String[] args) {
		/*
		 MyClass myclass=new MyClass();
		 Thread thread=new Thread(myclass);
		 thread.start();
		 */
		// Runnable is functional interface with void run() method.
		Runnable runnable = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("hello" + i);
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
	}
}
