import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int p,s,m=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a==b&&a==c) {
			p=10000+(a*1000);
		}
		else if(a==b||b==c||a==c) {
			if(a==b) {
				s=a;
			}
			else if(b==c) {
				s=b;
			}
			else {
				s=c;
			}
			p=1000+(s*100);
		}
		else { 
			if(a<b) {
				if(b<c) { 
					m=c;
				}
				else { 
					m=b;
				}
			}
			else if(a>b) {
				if(b>c) {
					m=a;
				}
				else {
					if(a>c) {
						m=a;
					}
					else {
						m=c;
					}
				}
			}
			p=m*100;
		}
			
		
		System.out.println(p);
	}
}
