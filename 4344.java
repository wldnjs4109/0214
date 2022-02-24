import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int C=sc.nextInt();
		
		for(int j=0;j<C;j++) {
			int N=sc.nextInt();
			int[] score=new int[N];
			double avr,r;
			double sum=0,h=0;
			
			for(int i=0;i<N;i++) {
			score[i]=sc.nextInt();
			sum+=score[i];
			}
			avr=sum/N;
			for(int i=0;i<N;i++) {
				if(score[i]>avr) {
					h++;
				}
			}
			r=(h/N)*100;
			System.out.printf("%.3f%%\n",(double)r);
		}
	}
}
