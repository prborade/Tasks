package MultiThredingDemo;

import java.util.Scanner;

public class Example {

	int passCount(int a[],int size){
		int c=0;
		for(int i=0;i<a.length;i++){
			if(i%2!=0){
		    if(a[i]>=70){
			c++;
			
		}
		}
	}
		System.out.println("count"+c);

		return c;
			}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element:");
        int size= sc.nextInt();
        if(size<0){
        	System.out.println("Invalid array size");
        }
        else{
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){

	    	   if(i%2!=0){
	    		   System.out.println("enter the mark:");
	    		   a[i]=sc.nextInt();
	    	   }else{
	    		   System.out.println("enter the roll no:");
	    		   a[i]=sc.nextInt();
	    	   }
        
       
        if(a[i]<0){
        	System.out.println("Invalid array value");
        }
        }
       Example e = new Example();
       e.passCount(a, size);
      
        
	}
	}
}



	
	