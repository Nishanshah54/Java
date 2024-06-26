import java.util.Scanner;

/**
 * Q8_2_Palindrome_Check
 * using Using a Loop
 */
public class Q8_2_Palindrome_Check 
{
     static void Q8_2_Palindrome_Check (int num)
    {
        int i=0;
        char ch;
        String Rnum=String.valueOf(num);
        String RevStr="";
        for(i=0;i<Rnum.length();i++)
        {
            ch=Rnum.charAt(i);
            RevStr=ch+RevStr;
        }
        
        System.out.println(RevStr);
         int RevNum=Integer.parseInt(RevStr);
         if(num==RevNum)
         {
            System.out.println("Yes! Palindrome Number : "+num);
         }
         else
         {
            System.out.println("NO! Palindrome Number : "+num);
         }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check Pelindrome Number");
        
        int num=sc.nextInt();
        // int num=100;
        Q8_2_Palindrome_Check (num);
        sc.close();
    }
    
}