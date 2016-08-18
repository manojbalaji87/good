import java.util.*;
import java.lang.*;
import java.io.*;


class JavaProgram
{
   public static void main(String args[])
   {
       String strOrig, strNew;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       strOrig = scan.nextLine();
       
       System.out.print("Removing Vowels from The String [" +strOrig+ "]\n");
       strNew = strOrig.replaceAll("[aeiouAEIOU]", "");
	   
       
        StringBuffer sb=new StringBuffer(strNew);
        System.out.println(sb.reverse());
       
   }
}
