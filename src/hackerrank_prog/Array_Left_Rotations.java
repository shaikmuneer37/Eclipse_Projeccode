package hackerrank_prog;



public class Array_Left_Rotations {
	

	public static void main(String[] args) 
	{
		
			
		 int n =5;

	     int d = 3; 

	     int[] a =  {1,2,3,4,5,6};


	   
	    	
	    	System.out.print(" Original array =");
	    	
	    	for(int i=0;i < a.length ;i++)
	    	{
	    		System.out.print( a[i]+" ");
	        }
	    	
	    	
	     	for(int i=0;i < d ;i++)
	       	{
	    		int temp , j;
	    		
	    		temp = a[0];
	    		
	    		for( j=0;j < a.length-1;j++) 
	    		{
	    			 a [j] =  a[j+1];
	    		}
	    		
	    		a[j] =temp;
	    		
	    	
	    	}
	    	System.out.println();
	    	
	    	System.out.print(" Rotation array = ");
	    	for(int i=0; i < a.length;i++) 
	    	{
	    		System.out.print( a[i]+ " ");
	    	}
		


	    
    	
    
    }
}
