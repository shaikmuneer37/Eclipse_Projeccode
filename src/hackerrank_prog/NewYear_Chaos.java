package hackerrank_prog;

import java.util.Scanner;

public class NewYear_Chaos {

	static void minimumBribes(int[] q) {
        int ans = 0;
        System.out.println();
        System.out.println(" q leg ="+q.length );
        
        for(int i=q.length-1;i>=0;i--)
        {
            int ch_pos = q[i]-(i+1);
            
          //  System.out.println("q[i]=" + q[i] + "  " + i+1 );
            if(ch_pos>2)
            {
            	System.out.println("Too chaotic");
                 return; 
            }
            else{
                int st = Math.max(0,q[i]-2);
                System.out.println(" st=" +st);
                for(int j=st;j<i;j++){
                    if(q[j]>q[i]) 
                    	ans++;
                    System.out.println("q[i]=" + q[i] + "  " + " q[j]=" + q[j]);
                      
                    
                }
            }
        }
        System.out.println("ans ="+ans);
    }

	    private static final Scanner scanner = new Scanner(System.in);
	    

	    public static void main(String[] args) {
	    	
	    	 System.out.println("enter input data");
	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            int n = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	         //   System.out.println(" n ="+ n);

	            int[] q = new int[n];
	          //  System.out.println("input  q ="+ q);

	            String[] qItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	            //System.out.println("qitems ="+ qItems.toString());

	            for (int i = 0; i < n; i++) {
	                int qItem = Integer.parseInt(qItems[i]);
	                q[i] = qItem;
	            }

	            minimumBribes(q);
	        }

	        scanner.close();
	    }

}
/*//Sample Input

2
5
2 1 5 3 4
5
2 5 1 3 4
Sample Output

3
Too chaotic*/
