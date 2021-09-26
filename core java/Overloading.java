package Oops;

public class Overloading {

	public void add(int a,int b){
		   System.out.println("Addition 2 number:" + (a+b));
	}
	
	
	public void add(int a,int b,int c){
		System.out.println("Addition 3 number:" + (a+b+c));
	}
	public void add(int a,double b){
	System.out.println("Addition data type different:" + (a+b));
 }
	public static void main(String[] args) {
		Overloading m = new Overloading();
		m.add(1, 2.5);
        m.add(3, 2);
       m.add(2, 2, 3);
	}

}
