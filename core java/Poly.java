package Oops;

public class Poly {



	public static void main(String[] args) {
		Poly p = new Poly();
        shobha c = new shobha(" ");
       c.cyc(2,2);
	}

}
class F{
	int a=10;
	char c='e';
void cyc(){
	System.out.println("parent");
	
}

}

class pooja extends F{
	public pooja(String c){
		System.out.println("edu");
	}
	void cyc(int a,int b){
		{
			super.cyc();
		}
		System.out.println("daughter");
	}
	
	}
class shobha extends pooja{
	
	public shobha(String c) {
		super("edub");
	}

	void cyc(int a,int b){
		{
		
		super.cyc(3,5);
		}		
		System.out.println("sister"+ super.a);
		System.out.println(super.c);
	}
}