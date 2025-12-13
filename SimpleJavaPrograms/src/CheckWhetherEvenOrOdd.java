package src;

import java.util.Scanner;

public class CheckWhetherEvenOrOdd
{
  static void PrintEvenOrOdd(int num)
  {
    if((num % 2) == 0)
    {
      System.out.println("");
      System.out.println("Number " + num + " is even");
    }
    else
    {
      System.out.println("");
      System.out.println("Number " + num + " is odd");
    }
  }
  public static void Main()
  {
    try
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("");
      System.out.println("Enter an Number");
      int num = scan.nextInt();

      PrintEvenOrOdd(num);
    }
    catch (Exception e)
    {
      System.out.println("Exception:- Enter an Number");
    }
  }
}
