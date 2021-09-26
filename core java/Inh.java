package Oops;

public class Inh {
	
	public static void main(String[] args) {
     Son s= new Son();
	s.m1();s.m2();
    System.out.println(s.b);
	}

}

class Parent{
	int a=10,b=5;
	int sum=(a+b);
	void m1(){
	System.out.println("addition:" + sum);
	System.out.println("substraction:" + (a-b));
}
}
 class Son extends Parent{
 void m2(){
	 System.out.println("mul:" +(a*b)); 
 }
}
