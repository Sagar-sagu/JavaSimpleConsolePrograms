import java.util.Scanner;

public class Main
{
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("");
      System.out.println("JavaSimplePrograms");
      System.out.println("");
      System.out.println("1.SimpleAirthmaticOperations");
      System.out.println("2.SwapTwoNumbers");
      System.out.println("3.returnCopyOfIntegerAndStringValueInArrays");
      System.out.println("");
      System.out.println("Select option (1/2/3)");
      String choice = scan.nextLine();

      switch (choice)
      {
        case "1":SimpleAirthmaticOperations.Main();
                 break;
        case "2":SwapTwoNumbers.Main();
                 break;
        case "3":returnCopyOfIntegerAndStringValueInArrays.Main();
                 break;
        default:System.out.println("Enter valid choice");
      }
    }
  }
}
