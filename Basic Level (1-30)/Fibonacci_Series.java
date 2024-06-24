import java.util.Scanner;

/**
 * Fibonacci Series
 */
public class Fibonacci_Series 
{
    public static void Fibonacci_Ser(int x)
    {
        int a = 0;
        int b = 1;
        int temp;
        
        System.out.println(a); // Print first number
        if (x > 1) {
            System.out.println(b); // Print second number
        }

        for (int i = 2; i < x; i++) // Start loop from 2 since 0 and 1 are already printed
        {
            temp = a + b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
    }
            
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to where you want to find the Fibonacci Series");
        int num = sc.nextInt();
        Fibonacci_Ser(num);
    }
}
