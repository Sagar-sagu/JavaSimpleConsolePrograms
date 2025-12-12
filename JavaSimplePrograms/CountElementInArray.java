public class CountElementInArray
{
    public static void main(String[] args)
    {
        int[] array = {5,6,5,31,6,8,65,5,23,78,5,21,5,87,96,5,4,5,};
        int count=0;

        for(int i=0;i<array.length;i++)
        {
              if(array[i]==5)
              {
              count++;
              }
          }
          System.out.println(count);
    }
}
