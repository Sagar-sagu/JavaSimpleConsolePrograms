package src;

import java.util.ArrayList;
import java.util.Scanner;

public class returnCopyOfElementsInArrays
{
  static ArrayList<String> returnCopyOfCharactersOrStringsValues(String[] array1,String[] array2)
  {
    ArrayList<String> list = new ArrayList<>();
    for (int i=0;i<array1.length;i++)
    {
      for (int j=0;j<array2.length;j++)
      {
        if (array1[i]==array2[j])
        {
          list.add(array2[j]) ;
        }
      }
    }
    return list;
  }

  static ArrayList<Integer> returnCopyOfIntegersvalues(int[] IntArray1,int[] IntArray2)
  {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i=0;i<IntArray1.length;i++)
    {
      for (int j=0;j<IntArray2.length;j++)
      {
        if (IntArray1[i]==IntArray2[j])
        {
          list.add(IntArray2[j]) ;
        }
      }
    }
    return list;
  }

  public static void Main()
  {
    try
    {
      Scanner scan = new Scanner(System.in);

      String[] array1=new String[5];
      String[] array2=new String[5];
      int[] IntArray1=new int[5];
      int[] IntArray2=new int[5];
      System.out.println("Note:-");
      System.out.println("enter five String or character");
      System.out.println("don't mix, choose one");
      System.out.println("");
      System.out.println("Enter 1st array ");
      for (int i=0;i<array1.length;i++)
      {
        array1[i]=scan.nextLine();
      }
      System.out.println("Enter 2nd array ");
      for (int i=0;i<array1.length;i++)
      {
        array2[i]=scan.nextLine();
      }

      System.out.println("");
      System.out.println("enter five Integer");
      System.out.println("Enter 1st array ");
      for (int i=0;i<IntArray1.length;i++)
      {
        IntArray1[i]=scan.nextInt();
      }
      System.out.println("Enter 2nd array ");
      for (int i=0;i<IntArray2.length;i++)
      {
        IntArray2[i]=scan.nextInt();
      }

      ArrayList<String> result1 = returnCopyOfCharactersOrStringsValues(array1,array2);
      ArrayList<Integer> result2 = returnCopyOfIntegersvalues(IntArray1,IntArray2);
      System.out.println(result1);
      System.out.println(result2);

    }
    catch (Exception e)
    {
    System.out.println("Enter  Integer Elements ");
    }
  }
}
