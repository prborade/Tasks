package MultiThredingDemo;

public class Demo extends Thread {
   public void run(){
	   for(int i=1;i<=5;i++){
		   System.out.println("hi");
	   }
   }
	public static void main(String[] args) {
	 Demo d = new Demo();
	 d.run();
	 

	}

}
