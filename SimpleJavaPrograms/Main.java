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
      System.out.println("Simple Java Programs");
      System.out.println("");
      System.out.println("1.Simple Airthmatic Operations");
      System.out.println("2.Swap Two Numbers");
      System.out.println("3.return Copy Of Elements In Arrays");
      System.out.println("4.reverse Integer And String");
      System.out.println("5.Count Element In An Array");
      System.out.println("6.Print Fibonacci Series");
      System.out.println("7.Print Numbers Using Recursion");
      System.out.println("8.Print Multiplication Table");
      System.out.println("9.Check Whether Even Or Odd");
      System.out.println("10.Guess Your Age");
      System.out.println("11.tic tac Game");
      System.out.println("");
      System.out.println("Select option (1/2/3/4/5/6/7/8/9/10/11)");
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
        case "10":GuessYourAge.Main();
                 break;
        case "11":TicTacToeGame.Main();
                 break;
        default:System.out.println("Enter valid choice");
                 break;
      }
    }
  }
}
