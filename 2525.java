import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int A=s.nextInt(); 
		int B=s.nextInt(); 
		int C=s.nextInt(); 
		int t,m;
 
		if(B+C>=60) {
			t=A+((B+C)/60);
			m=(B+C)%60;
			if(t>23) { 
				t-=24;
			}
		}
		else {
			t=A;
			m=B+C;
		}
		System.out.println(t+" "+m);
	}
}
