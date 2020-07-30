package hackerrank_prog;


import java.util.Scanner;

public class Array_Manipulation 
{
	public static void main (String [] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("input ");

    //Input the size of the array and the number of manipulations
    int n = 5 ;//s.nextInt();
    int t = 3;// s.nextInt();
        
    //Allocate the memory to the array dynamically as n can be of order 10^7 and use long as values after summing may exceed range of int
    long[] arr = new long[n + 2]; 
    //Keep the size n+2 as we'll be using 1-indexed array and we're also accessing (b+1)th element
    //Initial value of elements of array is 0 by default.

    while (t-- >0)   // t value is more than ZERO
     {  
        //Input indices and value to be added
        int a =2;// s.nextInt();
        int b = 5; //s.nextInt();
        int k = 100; //s.nextInt();
        arr[a] += k;        //Add the value to the left index
        arr[b + 1] -= k;    //Subtract the value from the element at b+1 index
      }
    
    long res = 0;   //res will store the answer to the problem, i.e., maximum value present in the array after all the manipulations

    //This is the implementation of prefix sum array (or cumulative array)
    //Iterating through all the elements, we'll keep adding the elements left to right
    for (int i = 1; i <= n; i++) 
      {
        arr[i] += arr[i - 1];
        res = Math.max(arr[i], res);     //Simultaneously update res if current element is greater than res
     }

    System.out.println(res);     //Finally print the result.

}

}

	/*static long arrayManipulation(int n, int[][] queries) {
		long max = Integer.MIN_VALUE;
		long[] D = new long[n + 1];
		long[] A = new long[n];
		D[0] = A[0];
		D[n] = 0L;
		for (int i = 1; i < n; i++)
			D[i] = A[i] - A[i - 1];

		for (int i = 0; i < queries.length; i++) {
			int[] q = queries[i];
			int a = q[0];
			int b = q[1];
			int k = q[2];
			update(D, a - 1, b - 1, k);
		}

		for (int i = 0; i < A.length; i++) {

			if (i == 0)
				A[i] = D[i];
			else {
				A[i] = D[i] + A[i - 1];
				if (A[i] > max)
					max = A[i];
			}
		}
		return max;
	}

	static void update(long D[], int l, int r, int x) {
		D[l] += x;
		D[r + 1] -= x;
	}

	private static final Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) throws IOException 
	{

		System.out.println("Enter input data");
		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
			}
		}

		long result = arrayManipulation(n, queries);
		System.out.println(result);

		 

        input data :-
        5 3
        1 2 100
        2 5 100
        3 4 100

        output is -200
		 


		scanner.close();
	}
}


*/