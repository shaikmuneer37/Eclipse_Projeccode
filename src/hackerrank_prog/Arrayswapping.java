package hackerrank_prog ;

import java.util.HashMap;

public class Arrayswapping
{
	
	public static void main (String [] args)
	{
		
		
		int arr [] = {2,3,4,5,1,6};
		
		boolean[] isviable = new boolean [arr.length +1];
		
		HashMap <Integer,Integer> maps = new HashMap <Integer, Integer>();
		
		for(int i=1;i< isviable.length;i++)
		{
			maps.put(i, arr[i-1]);
		}
		
		int swapcount = 0;
		
		for(int k=1;k < maps.size();k++) 
		{
			int nextnode = 0 ;
			
			if(isviable[k] == false)
			{
				isviable[k] = true;
				
				
				if( k == maps.get(k))
				{
					continue;
				}
				else
				{
					int c = maps.get(k);
					
					while ( ! isviable[c])
					{
						isviable[c] = true ;
						
						nextnode = maps.get(c);
						 c = nextnode ;
						 swapcount ++;
					    }
					
				 }
				
			}

		}
		
		
		
		
		System.out.println("swapcount="+swapcount );
		
	}
}