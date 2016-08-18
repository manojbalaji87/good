import java.util.*;
import java.lang.*;
import java.io.*;


class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,fact=1;
		Scanner s=new Scanner(System.in);
	  int a=s.nextInt();
		for(i=1;i<=a;i++)
		{
		    fact=fact*i;
		    
		}
		System.out.println(fact);
	}
}
