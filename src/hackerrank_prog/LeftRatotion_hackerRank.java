package hackerrank_prog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeftRatotion_hackerRank {
	

	 
	 private static int[] rotLeft(int[] a, int d) 
	 {
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
				return a;
	            
	 }
	    
	     
	
	   private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	      // BufferedReader bufferedWriter = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/Output_path/"));
            System.out.println("input");
	        String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        int[] result = rotLeft(a, d);
	        
	       
	        for(int i=0; i < a.length;i++) 
	    	{
	    		System.out.print( a[i]+ " ");
	    	}

	        /*for (int i = 0; i < result.length; i++) {
	            bufferedWriter.write(String.valueOf(result[i]));

	            if (i != result.length - 1) {
	                bufferedWriter.write(" ");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();*/

	        scanner.close();
	    }

		/**/
	}



