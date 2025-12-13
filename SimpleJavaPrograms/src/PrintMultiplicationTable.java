package src;

import java.util.Scanner;

public class PrintMultiplicationTable
{
  static void MultiplyGivenValueAndPrint(int num)
  {
    for (int i=1;i<11;i++)
    {
      System.out.println("");
      System.out.println(num + " x " + i + " = " + num*i);
    }
  }
  public static void Main()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter multiply Number");
    int num = scan.nextInt();

    MultiplyGivenValueAndPrint(num);
  }
}
