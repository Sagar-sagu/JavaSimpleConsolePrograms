import java.util.Scanner;

public class SwapTwoNumbers
{
  static void swapTwoNumbers(int num1,int num2)
  {
    int temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("");
    System.out.println("Before Swapping");
    System.out.println("1st Number:- " + num1);
    System.out.println("2nd number:- " + num2);
    System.out.println("");
    System.out.println("After Swapping");
    System.out.println("1st Number:- " + num1);
    System.out.println("2nd number:- " + num2);
  }

  public static void Main()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 1st Number");
    int num1=scan.nextInt();
    System.out.println("Enter 2nd Number");
    int num2=scan.nextInt();

    swapTwoNumbers(num1,num2);
  }
}
