// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int Grid[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] s = read.readLine().split(" ");
                for (int j = 0; j < N; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.diagonalSumDifference(N, Grid));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int diagonalSumDifference(int N, int[][] Grid) 
    {
        // code here
        int suml  = 0, sumr = 0;
        for(int i = 0; i <N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(i == j)
                    suml += Grid[i][j];
                if((i + j) == N - 1)
                    sumr += Grid[i][j];
            }
        }
        int res = suml - sumr;
        if(res >= 0)
            return res;
        else
            return -res;
    }
}