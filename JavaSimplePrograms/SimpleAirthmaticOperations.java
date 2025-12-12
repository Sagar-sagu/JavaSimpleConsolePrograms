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
    if (num2 == 0)
    {
      System.out.println("can't divisible by Zero");
    }
    int result = num1 / num2;
    return result;
  }
  public static void Main()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 1st Number");
    int num1=scan.nextInt();
    System.out.println("Enter 2nd Number");
    int num2=scan.nextInt();
    int result1 = AddTwoNumbers(num1,num2);
    int result2 = SubtractTwoNumbers(num1,num2);
    int result3 = MultiplyTwoNumbers(num1,num2);
    int result4 = DivisionTwoNumbers(num1,num2);
    System.out.println("AddTwoNumbers:- " + result1);
    System.out.println("SubtractTwoNumbers:- " + result2);
    System.out.println("MultiplyTwoNumbers:- " + result3);
    System.out.println("DivisionTwoNumbers:- " + result4);
  }
}
