//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long a[]=new long[n];
		  long b[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      a[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      b[i]=sc.nextLong();
		  }
		  
		  System.out.println(check(a,b,n)==true?"1":"0");
		  
		  
		}
	}

 // } Driver Code Ends


//User function Template for Java


public static boolean check(long arr[],long brr[],int n)
{
    //Your code here
    Arrays.sort(arr);
    Arrays.sort(brr);
    int count = 0;
    for(int i = 0; i < n; i++)
    {
        if(arr[i] == brr[i])
            count++;
    }
    if(count == n)
        return true;
    else
        return false;
    
}

// { Driver Code Starts.
	    



}  // } Driver Code Ends