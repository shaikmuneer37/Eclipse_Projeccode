package Interview;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i <= 100; i++) 
		{
			int count =0;
			
			for(int j=i;j >=1 ;j--)
			{
				if( i%j == 0)
				
				{
					count = count +1;
				}
			}
			
			if(count == 2)
			{
				System.out.println("Prime Number = "+i+" ");
			}
			
			if(i%2 == 0)
			{
				System.out.println("Even Number  = "+i+" ");
			}
			
			if(i%2 == 1)
			{
				System.out.println("odd Number   = "+i+" ");
			}
		}
		
		
	}

}
