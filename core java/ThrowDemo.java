package ExceptionDemo;

public class ThrowDemo {
	public static void validate(int age){
		if(age<18){
			throw new ArithmeticException ();
		}else{
			System.out.println("welcome for vote");
		}
	}

	public static void main(String[] args) {
		validate(17);
		System.out.println("rest of code");

	}

}
