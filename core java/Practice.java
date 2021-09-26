package MultiThredingDemo;

public class Practice {

	public static void main(String[] args) {
		NumberSystem n = new NumberSystem();
		AlphaSystem a = new AlphaSystem();
		
		n.start();
		a.start();
		
		  //how to get to know the state of thread's
		   System.out.println(n.getState());
		   System.out.println(a.getState());
		   
		   //hot to get to know the priority of thread's
		   System.out.println(n.getPriority());
		   System.out.println(a.getPriority());
		   
		   //print the name of thread's
		   System.out.println(n.getName());
		   System.out.println(a.getName());

		   //set the name thread's
		   n.setName("Harshada");
		   a.setName("madhura");
		   
		   //how to find the current thread of our program
		   System.out.println("The Current Thread is :" + Thread.currentThread().getName());
		   
		 //how to get to know the state of thread's
		   System.out.println(n.getState());
		   System.out.println(a.getState());
		   
		   //finding live or alive state's

		   if(n.isAlive()){
			   System.out.println("Harshada thread is alive");
		   }
		   else{
			   System.out.println(" Number thread is Dead");
		   }
     if(a.isAlive()){
			   System.out.println("Madhura Thread is alive");
		   }
		   else{
			   System.out.println("Alpha Thread is Dead");
		   }
	   }	

	}


class NumberSystem extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
}

class AlphaSystem extends Thread{
	public static char c ='A';
	public void run(){
		for(int i=0;i<=25;i++){
			System.out.println(c);
			c=(char)(c+1);
		}
	}
}

