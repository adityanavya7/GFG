import java.lang.*;
import java.io.*;
public class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int k = 0; k < t; k++)
	    {
	        int n = sc.nextInt();
	        int arr[][] = new int [n][n];
	        int suml = 0, sumr = 0;
	        for(int i = 0; i < n; i++)
	        {
	            for(int j = 0; j < n; j++)
	                arr[i][j] = sc.nextInt();
	        }
	        for(int i = 0; i < n; i++)
	        {
	            for(int j = 0; j < n; j++)
	            {
	                if(i == j)
	                    suml += arr[i][j];
	                if(i + j == n - 1)
	                    sumr += arr[i][j];
	             }
	        }
	        System.out.println(suml+" "+sumr);
	    }
	 }
}