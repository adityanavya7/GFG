import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


/*
the function returns the 
position where the target string 
matches the string str

Your are required to complete this method */

class GfG
{
    int strstr(String s, String x)
    {
        //boolean flag = false;
        int n = -1;
        if(s.contains(x)) {
            n = s.indexOf(x);
        }
        return n;
       // Your code here
    }
}
