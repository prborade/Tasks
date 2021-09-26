package ExceptionDemo;

public class ExNestedCatch {

	public static void main(String[] args) {
	/*	int a=10;
		try{
		  System.out.println(a/0);
           String s =null;
		
		try{
			String st="this is java class";
			char c = st.charAt(25);
		}
		catch(Exception x){
        	 System.out.println(x);
         }
		}
	catch(Exception p){
   	 System.out.println(p);
    }
  */
		
		int a=10;
		try{
		 
         
		
		try{
			String st="this is java class";
			char c = st.charAt(16);
			System.out.println(c);
		  try{
			  String s =null;
			  System.out.println("string:"+ s);
		  }
		catch(Exception x){
        	 System.out.println(x);
         }
		
		}
	   catch(Exception p){
   	   System.out.println(p);
       }	
		}catch(Exception f){
			 System.out.println(f);
		}
		
		System.out.println("Next Line ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}