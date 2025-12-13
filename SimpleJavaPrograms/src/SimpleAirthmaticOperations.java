package src;

import java.util.Scanner;

public class SimpleAirthmaticOperations
{
  static int AddTwoNumbers(int num1,int num2)
  {
    int result = num1 + num2;
    return result;
  }

  static int SubtractTwoNumbers(int num1,int num2)
  {
    int result = num1 - num2;
    return result;
  }

  static int MultiplyTwoNumbers(int num1,int num2)
  {
    int result = num1 * num2;
    return result;
  }

  static int DivisionTwoNumbers(int num1,int num2)
  {
    try
    {
      if (num2 == 0)
      {
        System.out.println("can't divisible by Zero");
      }
    }
    catch (Exception e)
    {
      System.out.println("Exception:- " + e);
    }
      int result = num1 / num2;
      return result;
  }
  public static void Main()
  {
    try
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 1st Number");
      int num1=scan.nextInt();
      System.out.println("Enter 2nd Number");
      int num2=scan.nextInt();

      System.out.println("");
      System.out.println("Enter Operator");
      System.out.println("(+,-,*,/)");
      scan.nextLine();
      String choice = scan.nextLine();

      switch(choice)
      {
        case "+":int result1 = AddTwoNumbers(num1,num2);
                 System.out.println("AddTwoNumbers:- " + result1);
                 break;
        case "-":int result2 = SubtractTwoNumbers(num1,num2);
                 System.out.println("SubtractTwoNumbers:- " + result2);
                 break;
        case "*":int result3 = MultiplyTwoNumbers(num1,num2);
                 System.out.println("MultiplyTwoNumbers:- " + result3);
                 break;
        case "/":int result4 = DivisionTwoNumbers(num1,num2);
                 System.out.println("DivisionTwoNumbers:- " + result4);
                 break;
        default:System.out.println("enter valid choice");
                 break;
      }
    }
    catch (Exception e)
    {
      System.out.println("Exception:- enter numbers");
    }
  }
}
