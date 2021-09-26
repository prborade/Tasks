package ExceptionDemo;
import java.util.Scanner;
public class ThrowsDemo {
    
	public static void main(String[] args) throws Exception{
		Thursday.Division();

	}

  }
class Thursday{
	 public static void Division() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value A:");
		int a=sc.nextInt();
		System.out.println("Enter the value B:");
		int b=sc.nextInt();
		System.out.println("division:"+(a/b));
	}
}