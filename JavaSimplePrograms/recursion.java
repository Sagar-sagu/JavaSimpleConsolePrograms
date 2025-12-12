class recursion
{

static void callstack(int num)
      {
        if (num==5)
        {
        return;
        }
          System.out.println(num);
          ++num;
          callstack(num);
          System.out.println(num);
      }
      
public static void main(String[] args)
  {
      
      int num=0;
    callstack(num);
      
  }
}
