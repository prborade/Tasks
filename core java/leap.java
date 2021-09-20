package p.com;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
        int n = sc.nextInt();
        
        if(n%4==0 ) {  
        	if(n%100!=0) {
        	  if(n%400==0) {
        		System.out.println( n +" is leap year ");
        	   }
        	}
            else {
            	System.out.println( n +" is not leap year ");
            }
        
        }*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("menu");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.square");
		System.out.println("6.cube");                                            //
		System.out.println("Enter the choice:");                                 //using also if else enter two number, choice for addition and  
		int n = sc.nextInt();                                                    //enter 1 number,choice for cube
		
			  
		
		switch(n) {
		
		case 1:
			 System.out.println("Enter the 2 number:");
			  int a = sc.nextInt();
			  int b=sc.nextInt();
			  int sum = a+b;
			System.out.println("addition:" + sum);
		break;
		
		case 2:
			  System.out.println("Enter the 2 number:");
			  int c = sc.nextInt();
			  int d=sc.nextInt();
			int sub = c-d;
			System.out.println("substration:" + sub);
		break;
		
		case 3:
			System.out.println("Enter the 2 number:");
		    int e = sc.nextInt();
		    int f=sc.nextInt();
			int mul = e*f;
			System.out.println("multiplication:" + mul);
		break;
		
		
		case 4: 
			System.out.println("Enter the 2 number:");
		    int h = sc.nextInt();
		    int i=sc.nextInt();
			int div = h/i;
			System.out.println("division:" + div);
		break;
		
		
		case 5:
			System.out.println("Enter the 1 number:");
		    int s = sc.nextInt();
			System.out.println("square:" + (s*s));
		break;
		
		case 6:
			System.out.println("Enter the 1 number:");
		    int p = sc.nextInt();
			System.out.println("cube:" + (p*p*p));
		break;
		
		default:
			System.out.println("invalid choice");
			break;
		}
		}
	
	
		
		
		
		
	}


