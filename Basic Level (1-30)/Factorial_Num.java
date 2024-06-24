import java.util.Scanner;

/**
 * Factorial_Num
 */
public class Factorial_Num 
{
    static  int find(int x)
    {
        if(x==1)
        {
            return x;
        }
        if(x>=1)
        {
            // System.out.println( "value +"+x);
            return x*(x-1);
        }
      
        return 1;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number or Integer to find the factorial Number");
        int num=sc.nextInt();
       int result=find(num);
       System.out.println( "The Factorial Number of "+num +" is "+result);
       sc.close();
}
}