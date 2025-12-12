public class CountElementInAnArray
{
  static int countIntegers(int[] array)
  {
    int count=0;

    for(int i=0;i<array.length;i++)
    {
      if(array[i]==5)
      {
      count++;
      }
    }
    return count;
  }
    public static void Main()
    {
      try
      {
        int[] array = {6,78,4,23,7,8,21,5,9,78,21,78,5,78,84,78,21,78,21,54,78,4,4,45};
        System.out.println(array);
        System.out.println("");
        int result = countIntegers(array);
        System.out.println("count:- " + result);
      }
      catch(Exception e)
      {
        System.out.println("Exception:- " + e);
      }
  }
}
