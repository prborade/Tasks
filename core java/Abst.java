package Oops;

public class Abst {

	public static void main(String[] args) {
		child c =  new child();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
       
	}

}
abstract class RIB {
	abstract void m1();        //abstract method
	abstract void m2();        //abstract method
	
	void m3(){                        // non abstract method
		System.out.println("non abstract method");
	}
	private final void m5(){                 //this is not access means not create object because private and final.
		 System.out.println("m5");
	}
	 }
	
class child extends RIB{
	public void m1(){                           //complete abstract method1 implementation
		 System.out.println("m1 method");
	}
	public void m2(){                          //complete abstract method2 implementation
		 System.out.println("m2 method");
	}
	void m4(){                                //normal & extra method add here.
		 System.out.println("m4 method");
	}
}