import java.util.Scanner;
/**
 * Q13_Prime_Number_Check
 */
public class Q13_Prime_Number_Check
 {
    public static void  check_prime( int num)
    {
        if(num<=1)
        {
            System.out.println("Not Prime Number");
            return;
        }
        boolean isPrime=true;
        int a=num/2;
        for(int i=2;i<=a;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("The Number is Prime");
        }
        else
        {
            System.out.println("Number is Not a Prime Number");
        }

    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer:");   
        int num=sc.nextInt();
        check_prime(num);
        sc.close();
    }
    
}