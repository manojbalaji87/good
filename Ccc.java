

import java.util.*;
import java.io.*;

 
class Ccc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sb=new Scanner(System.in);
		n=sb.nextInt();
		int[] ab=new int[n];
		Object[] a;
		for(int i=0;i<n;i++)
		{
		    a[i]=sb.nextInt();
		}
		for(int i = 0;i<n-1;i++)
		{
		    for(int j=i+1;j<=n;j++)
		    {
		        if((a[i]+a[j])==0)
		        {
		            System.out.println("the values are"+a[i]+""+a[j]);
		        }
		    }
		}
	}
}
