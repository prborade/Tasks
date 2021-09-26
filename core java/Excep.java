package ExceptionDemo;

import java.util.Scanner;

public class Excep {

	public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the value:");
         int a = sc.nextInt();
      
    //     String d = "abc";
         System.out.println("hiiii");
         
         /*
         try{
         System.out.println(a/0);
         }catch(ArithmeticException e){
         System.out.println("hellow");
         }
         
         try{
         System.out.println(s.length());
         }catch(NullPointerException w){
        	 System.out.println("null value");
         }
         
         try{
         int i = Integer.parseInt(d);
	     }catch(NumberFormatException n){
	    	 System.out.println("not convert into int");
	     }
         */
         try{
        	 String s;
        	 System.out.println(a/0);
        	
         }catch(ArithmeticException x){
        	 System.out.println("sorry");
         }catch(NullPointerException p){
        	 System.out.println("no");
         }catch(Exception c){
            System.out.println("ohhh");
         }
	
	
	}
}
