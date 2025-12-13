package src;

import java.util.Scanner;

public class reverseIntegerAndString
{
    public static void Main()
    {
      try
      {
        String[] str=new String[5];
        Scanner ip=new Scanner(System.in);
        System.out.println("enter five character ");
        for (int i=0;i<str.length;i++)
        {
          str[i]=ip.nextLine();
        }

    		for (int i=str.length-1;i>=0;i--)
    		{
    			System.out.print(str[i]);
          System.out.println("");
          System.out.print(str[i] + "->");
    		}
      }
      catch (Exception e)
      {
      System.out.println("Exception:- " + e);
      }
    }
}
