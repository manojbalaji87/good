import java.util.*;
import java.lang.*;
import java.io.*;


class Rever
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int revernum=0;
	    System.out.println("Enter the number");
	    Scanner sb=new Scanner(System.in);
	  int a=sb.nextInt();
	    while(a!=0)
	    {
	        revernum=revernum*10;
	        revernum=revernum + a%10;
	        a=a/10;
	    }System.out.println(revernum);
	}
}
