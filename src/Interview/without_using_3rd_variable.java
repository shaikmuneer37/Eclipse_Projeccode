package Interview;

public class without_using_3rd_variable {

	public static void main(String[] args) {


		int a= 10;
		int b=30;


		a = a+b;

		System.out.println("bs="+a);

		b= a-b;

		System.out.println("new b= "+b);

		a=a-b;
		System.out.println("new a= "+a);


		System.out.println("String Swaping ");
		
		String j= "love"; // 4 length 
		String k ="you"; // 3 length
		
		j= j+k;  // loveyou //7 length
		
		System.out.println("bs="+j);
		
		k= j.substring(0, j.length()- k.length());  // ( 0,  7-4=3) 
		
		System.out.println("k="+k); //   k= love  
		
		j= j.substring(k.length());  //  its start from after 4 th index  :- you
		
		System.out.println("j="+j); // you
		
	}

}
