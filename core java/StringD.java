package StringDemo;

public class StringD {

	public static void main(String[] args) {
//		String s1 = " pooja";
//		String s2 = "POOJA";
//		String s3 =s2.intern();
//		
//         if(s1==s2){
//    	       System.out.println("same reference");
//         }else{
//    	      System.out.println("not same reference");
//          }
//     
//     if(s1.equals(s2)){
//    	 System.out.println("same");
//     }
//     else{
//    	 System.out.println("not same");
//     }
//     System.out.println(s1.compareTo(s2));
//     System.out.println(s1.toUpperCase());
//     System.out.println(s2.toLowerCase());
//     System.out.println(s1.trim());
//     System.out.println(s1.startsWith("r"));
//     System.out.println(s1.endsWith("a"));
//     System.out.println(s1.charAt(1));
//     System.out.println(s1.length());
//     System.out.println(s3);
//     
//     int a=10;
//     String s = String.valueOf(a);
//     System.out.println(s);
//     
//     String replaceString =s1.replace("pooja", "java");
//     System.out.println(replaceString);
//     
//     String s4 = "Nivrutti" + " Borade";
//     System.out.println(s4);
//     
//     String s5="savita";
//     String s6="Borade";
//     String s7=s5.concat(s6);
//     System.out.println(s7);
     
     StringBuffer d = new  StringBuffer("welcome to pune");
     System.out.println(d.insert(1,"Java"));
     d.replace(1,3,"kava");
     System.out.println(d);
     
     
	}

}
