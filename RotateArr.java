import java.lang.*;
import java.io.*;
class GFG
 {
    static void leftRotate(int arr[], int d)
    {
 
        if (d == 0)
            return;
 
        int n = arr.length;
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
 
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
 
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    for(int t = 0; t < test; t++)
	    {
	        int N = sc.nextInt();
	        int D = sc.nextInt();
	        int arr[] = new int[N];
	        for(int i = 0; i < N; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        leftRotate(arr, D); 
            printArray(arr);
	    }
	 }
}