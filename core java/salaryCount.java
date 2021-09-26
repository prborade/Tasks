package ArrayDemo;
import java.util.*;
public class salaryCount {
	int countRepeaters(int a[] ,int n){
		int c=1;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
		          if(a[i]==a[j]){
		      
		          c=c+1;
		}
		  }
		}
		System.out.println("count:"+c);
		return c;
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of people:");
    int n = sc.nextInt();
   
 
    if(n<0){
    	System.out.println("invalide size");
    }
    else{
       int[] a = new int[n];
    	for(int i=0;i<a.length;i++){
    		a[i]=sc.nextInt();
    	if(a[i]<0){
    		
    	   System.out.println("invalide value");
           }
         }
     
    
    salaryCount s=new salaryCount();
    System.out.println(s.countRepeaters(a,n));
	}
	  }
}
