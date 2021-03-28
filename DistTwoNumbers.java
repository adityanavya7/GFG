// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    int minDist(int arr[], int n, int x, int y) 
    {  
        int mindist = n, p = 2*n, p2 = 2*n;
        for(int i = 0; i < n; i++)
        {
        if(arr[i] == x)
        {
            p = i;
            mindist = Math.min(mindist, Math.abs(p - p2));
        }
        else if(arr[i] == y)
        {
            p2 = i;
            mindist = Math.min(mindist, Math.abs(p - p2));
        }
        }
        
        return mindist == n ? -1 : mindist;
        // code here
    }
}