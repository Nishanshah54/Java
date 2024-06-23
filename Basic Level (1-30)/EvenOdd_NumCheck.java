import java.util.Scanner;

public class EvenOdd_NumCheck 
{
   static  boolean checkEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        return false;
       

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to Check Even or Not");
        int x=sc.nextInt();
       
        System.out.println(x+" is Even number --->"+ checkEven(x));
        sc.close();

    }
}
