package ThreadConcept;

class Thread1 extends Thread{
	public void run() {
		Thread1 t1 = new Thread1();
		
		//set daemon as true
		t1.setDaemon(true);
		
		//checking daemon is true / false
		System.out.println("Daemon : "+t1.isDaemon());
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Thread 1 is running.....");
			
			//give sleep for 2 sec to each iteration
			try {
				t1.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		Thread2 t2 = new Thread2();
		for(int i=0;i<5;i++) {
			System.out.println("Thread 2 is running.....");
			try {
				t2.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyThread {

	public static void main(String[] args) {
		
		//create object for two thread classes
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		//check the state for thread1
		System.out.println(t1.getState());
		
		//check the thread is alive or not for both t1 and t2
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		//start the thread
		t1.start();
		
		//check the state for thread1
		System.out.println(t1.getState());
		
		//give wait for thread 1 for 2 sec
		try {
			t1.join(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//check the state for thread1
		System.out.println(t1.getState());
		
		//start the thread 2
		t2.start();
		
		//give wait for thread 1 for permanent wait
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//check the state for thread2
		System.out.println(t2.getState());
		
		//check the state for thread1
		System.out.println(t1.getState());
		
		//check the thread is alive or not for both t1 and t2
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		

	}

}
