import java.util.Scanner;

public class fibonacci 
{

    static void fibonacci_with_recursion(int increment,int target,int var1,int var2,int sum)
    {
        if (increment==target-2)
        {
            return;
        }
       
        sum=var1+var2;
        System.out.println(sum);
        var1=var2;
        var2=sum;
        increment++;
        fibonacci_with_recursion(increment,target,var1,var2,sum);
    }

    static void fibonacci_with_forloop(int increment,int target,int var1,int var2,int sum)
    {
        System.out.println(0);
        System.out.println(1);

         for (increment=0;increment<target-2;increment++)
        {
            sum=var1+var2;
            System.out.println(sum);
            var1=var2;
            var2=sum;
        }
    }
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("enter how much element you to print fibonaci series");
        int target=ip.nextInt();
        System.out.println();
        
        int var1=0;
        int var2=1;
        int sum=0;
        int increment=0;
        
        System.out.println("this is recursion method for fibonacci series");
        System.out.println(0);
        System.out.println(1);
        fibonacci_with_recursion(increment,target,var1,var2,sum);
        System.out.println();
        System.out.println("this is classic for loop method for fibonacci series");
       fibonacci_with_forloop(increment,target,var1,var2,sum);
    }
}
