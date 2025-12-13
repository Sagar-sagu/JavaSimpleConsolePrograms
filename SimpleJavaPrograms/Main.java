import java.util.Scanner;
import src.*;

public class Main
{
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("");
      System.out.println("SimpleJavaPrograms");
      System.out.println("");
      System.out.println("1.SimpleAirthmaticOperations");
      System.out.println("2.SwapTwoNumbers");
      System.out.println("3.returnCopyOfElementsInArrays");
      System.out.println("4.reverseIntegerAndString");
      System.out.println("5.CountElementInAnArray");
      System.out.println("6.PrintFibonacciSeries");
      System.out.println("7.PrintNumbersUsingRecursion");
      System.out.println("8.PrintMultiplicationTable");
      System.out.println("9.CheckWhetherEvenOrOdd");
      System.out.println("");
      System.out.println("Select option (1/2/3/4/5/6/7/8/)");
      String choice = scan.nextLine();

      switch (choice)
      {
        case "1":SimpleAirthmaticOperations.Main();
                 break;
        case "2":SwapTwoNumbers.Main();
                 break;
        case "3":returnCopyOfElementsInArrays.Main();
                 break;
        case "4":reverseIntegerAndString.Main();
                 break;
        case "5":CountElementInAnArray.Main();
                 break;
        case "6":PrintFibonacciSeries.Main();
                 break;
        case "7":PrintNumbersUsingRecursion.Main();
                 break;
        case "8":PrintMultiplicationTable.Main();
                 break;
        case "9":CheckWhetherEvenOrOdd.Main();
                 break;
        default:System.out.println("Enter valid choice");
                 break;
      }
    }
  }
}
