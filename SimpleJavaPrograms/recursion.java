class recursion
{
  static void callstack(int num)
  {
    //base case
    if (num==5)
    {
    return;
    }
    System.out.println(num);
    ++num;
    callstack(num);
    System.out.println(num);
  }

  public static void Main()
  {
    int num=0;
    callstack(num);
  }
}
