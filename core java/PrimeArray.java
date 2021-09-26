package ArrayDemo;

import java.util.Scanner;

public class PrimeArray {
 int PrimeIndexSum(int array[],int size){
	 int c=0;
	 for(int i=0;i<size;i++){
		for(int j=2;j<array[i];j++){
			if(i%j!=0){
				 c = c+array[i]; 
		}else{
			
			
		} 
		}
	 }
	 System.out.println(c);
	 return c;
 }

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int size = sc.nextInt();
    if(size<0){
    	System.out.println("Invalid array size");
    }
    else{
    int[] array = new int[size];
    for(int i=0;i<array.length;i++){
    array[i] = sc.nextInt();
    if(array[i]<0){
    	System.out.println("Invalid array value");
    }
    }
	
    PrimeArray p = new  PrimeArray();
   int o = p.PrimeIndexSum(array, size);
   System.out.println(o);
	}
}
}
