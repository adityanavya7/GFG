import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 for(int i = 0; i < t; i++)
	 {
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     int temp = a;
	     a = b;
	     b = temp;
	     System.out.println(a+" "+b);
	 }
	 }
}