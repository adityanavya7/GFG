import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 /*for(int i = 0; i < t; i++)
	 {
	     int n = sc.nextInt();
	     for(int k = 1; k <= n; k++)
	     {
	         for(int j = 1; j <= k; j++)
	            System.out.print("*");
	     }
	     System.out.print(" ");
	 }
	 System.out.println();
	 }*/
	 while(t-->0){
int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}System.out.print(" ");}System.out.println();

}
}
}