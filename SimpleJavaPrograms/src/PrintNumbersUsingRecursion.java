package src;

public class PrintNumbersUsingRecursion
{
  static void callstack(int num)
  {
    //base case
    if (num==6)
    {
    return;
    }
    System.out.println("");
    System.out.println(num);
    ++num;
    callstack(num);
    //System.out.println(num);
  }

  public static void Main()
  {
    int num=1;
    callstack(num);
  }
}
