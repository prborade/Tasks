package MultiThredingDemo;

public class lightDemo {

	public static void main(String[] args) {
		Redlight r = new Redlight();
		 greenlight g = new greenlight();
		 r.start();
		 g.start();
	}

}

class Redlight extends Thread{
	public void run(){
		for(int i=0;;i++){
			System.out.println("red signal:"+ i);
			try{
				Thread.sleep(20000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
	
}

class greenlight extends Thread{
	public void run(){
		for(int i=0;;i++){
			System.out.println("green signal:"+ i);
			try{
				Thread.sleep(20000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}