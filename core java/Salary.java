package Oops;

import java.util.Scanner;

public class Salary {

	public int calculateSal(int salary,int shift){
		if(salary>8000){
			System.out.println("salary too large");
		}
		if(shift<1){
			System.out.println("shift too small");
		}
		if(salary<0){
			System.out.println("salary too small");
		}
		 int remaining= (salary/2); 
		 int shift_sal=(shift*2)*(salary/100);
		 int total_saving = remaining + shift_sal;
		
		
		return total_saving;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int shift = sc.nextInt();
        
       Salary sa=new  Salary();
      
       System.out.println(sa.calculateSal(salary, shift));
	}

}
