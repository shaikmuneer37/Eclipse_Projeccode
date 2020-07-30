package hackerrank_prog ;


public class Array_Swap_HASHMAP
{
	public static void main(String [] args)
	{
		int count = 0;
		
		int arr [] = {2,3,4,5,1,6};
		
		for(int i=1; i <  arr.length;i++)
		{
			if(arr[i] == i+1)
			{
				//System.out.println("arr[i]="+arr[i]  + "  and " +i  );
				continue;
			}
			else
			{
				count++;
	            int tmp = arr[i];
	            arr[i] = arr[tmp-1];
	            arr[tmp-1] = tmp;
	            i--;
			}
		}
		System.out.println("count value");
		
		System.out.println(count);
	}
}