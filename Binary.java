import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}

// } Driver Code Ends


class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  int T=1;
	  while(T!=0){
	      int count=0;
	      int n = str.length();
	      char ch[]=str.toCharArray();
	      for(int i=0;i<n;i++){
	          if(ch[i]=='1'||ch[i]=='0'){
	              count++;
	          }
	      }
	      if(count==n) return true;
	      T--;
	  }return false;
	}
}