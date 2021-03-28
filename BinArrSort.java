//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading testcases count
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            
            String st[] = read.readLine().trim().split(" ");
            
            //reading size of array 
            int n =Integer.parseInt(st[0]);
            
            //creating a new array of size n
            int arr[] = new int[n];
            st = read.readLine().trim().split(" ");
            
            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st[i]);
                
            //calling the method binSort() of
            //class BinarySort()
            new BinarySort().binSort(arr, n);
            
            //printing the elements of array
            for(Integer x: arr)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class BinarySort
{
    static void binSort(int arr[], int n)
    {
        /*for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/
        Arrays.sort(arr);
    }
}

