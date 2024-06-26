import java.util.Scanner;

/**
 * Palindrome_Check
 * A palindromic number is a number that remains the same when its digits are reversed.
 * e.g 12321 
 */
public class Q8_1_Palindrome_Check
 {
     static void CheckPalindrom(int number)
     {
        StringBuilder sb=new StringBuilder();
        sb.append(number);
        StringBuilder r=sb.reverse();
        String reverstString=r.toString();
        int a=Integer.parseInt(reverstString);
        System.out.println(reverstString);
        if(number==a)
        {
            System.out.println( " Yes ! Palindrome number :"+number);
        }
       else
       {
        System.out.println(" Not!  Palindrome :"+number);
       }
     }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to Check Palindrome or Not");
            int num=sc.nextInt();
            // int num=123321;
            CheckPalindrom(num);
    }
    
}