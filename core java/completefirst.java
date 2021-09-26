package MultiThredingDemo;

public class completefirst {

	public static void main(String[] args) {
		Pranita p = new Pranita();
		Gunjan g = new Gunjan();
		Ragini r = new Ragini();
		
		p.start();
		try{
			p.join();
		}catch(Exception e){
			System.out.println(e);
		}
		
		g.start();
		try{
			g.join();
		}catch(Exception e){
			System.out.println(e);
		}

		r.start();
		try{
			r.join();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

class Pranita extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("pranita:"+i);
		}
	}
}


class Gunjan extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("gunjan:"+i);
		}
	}
}

class Ragini extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("ragini:"+i);
		}
	}
}