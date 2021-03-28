import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		GfG g=new GfG();
		g.convertFive(n);
	}
}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public static void convertFive(int n)
	{
	    /*int r = 0;
	    int unit = 1;
	    
	    if (n == 0)
	    {
	        r+=(5 * unit);
	    }
	    while(n > 0)
	    {
	        if(n%10 == 0)
	            r += (5 * unit);
	       
	        n/=10;
	        unit*=10;
	    }
	    System.out.println(r);*/
	    String s=Integer.toString(n);
        String sr=s.replace('0','5');
        System.out.println(sr);
	}
}