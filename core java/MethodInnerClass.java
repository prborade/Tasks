package Oops;

public class MethodInnerClass {

	public static void main(String[] args) {
		Trainer t = new Trainer();
		t.Oops();

	}

}
class Trainer{
	public void Oops(){
		System.out.println("outer class method");
		
	class Student{
		
	public void add(){
		System.out.println("this is method inside class method");
	}
	}
	Student s = new Student();
	s.add();
	}
}