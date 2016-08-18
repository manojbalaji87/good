import java.util.*;
import java.lang.*;
import java.io.*;


class Strr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	StringBuffer sbuffer = new StringBuffer();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string");
	sbuffer.append(input.nextLine());
	System.out.println(sbuffer.reverse());

	}
}
