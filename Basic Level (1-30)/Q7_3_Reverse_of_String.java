/**
 * Q7_3_Reverse_of_String
 * Using Recursion
 */
public class Q7_3_Reverse_of_String 
{
    public static String  Reverse_of_String(String str )
    {

        if (str.isEmpty()) {
            return str;
        }
        return Reverse_of_String(str.substring(1)) + str.charAt(0);
   }

    public static void main(String[] args) 
    {
      
            String original = "Hello, World!";
            String reversed = Reverse_of_String(original);
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        
    }
}