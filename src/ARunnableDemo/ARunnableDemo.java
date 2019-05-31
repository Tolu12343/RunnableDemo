package ARunnableDemo;

public class ARunnableDemo implements Runnable {

	private String threadname;
	
	public ARunnableDemo (String name) {
		this.setThreadname(name);
	}

	public String getThread() {
		return threadname;
	}

	public void setThreadname(String threadname) {
		this.threadname = threadname;
	}

	@Override
	public void run() {
		System.out.println(this.threadname+ " is running");
		
		try {
			for(int i = 0; i <=10; i++) {
		        System.out.println(i);}
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}	
	
	
}
