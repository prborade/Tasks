package X;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the key:");
    int n=sc.nextInt();
 //   int m = sc.nextInt();
 /*   if(n<25){
    	System.out.println("grade is J");
    }else if(n>=25 && n<=44){
    	System.out.println("grade is Z");
    }else if(n>=45 && n<=49){
    	System.out.println("grade is D");
    }else if(n>=50 && n<=59){
    	System.out.println("grade is C");
    }else if(n>=60 && n<=79){
    	System.out.println("grade is B");
    }else if(n>=80){
    	System.out.println("grade is A");
    } */
  
 /*   if(n==m){
    	System.out.println("it is square");
    }else{
    	System.out.println("it is not square");
    }
    
	*/
	switch(n/10){
	case 9: 
		 System.out.println("grade is A");
  	     break;
	case 8:
		   System.out.println("grade is A");
    	   break;
    case 7: 
    	   System.out.println("grade is B");
    	   break;
    case 6:
    	
    case 5:
    	System.out.println("grade is C");
    	break;
    case 4:
    	
    case 3:
    	System.out.println("grade is D");
    	break;
    case 2:
    	System.out.println("grade is D");
    	break;
    case 1:
    	System.out.println("grade is D");
    	break;
    default:
    	System.out.println("invalide");   
	}
  
	
	}
	
}
