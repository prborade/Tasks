package Oops;

public class Inheritance {
 
	public static void main(String[] args) {
		child2 s = new child2();
		s.m3();
		s.m1();
		child1 s1 = new child1();
	    s1.m2();
	    s1.m1();
	    child3 s2 = new child3();
		s2.m4();
		s2.m1();
	}

 }

class parent1{
	int sbi =10000;
	void m1(){
		System.out.println("parent have oldbike");
	}
}


class child1 extends parent1{
	void m2(){
		int sbi=15000;
		System.out.println("child1 bike");
	}
}

class child2 extends parent1{
	void m3(){
		int sbi=18000;
		System.out.println("child2 bike");
	}
}

class child3 extends parent1{
	void m4(){
		int sbi=28000;
		System.out.println("child3 bike");
	}
}

