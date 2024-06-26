/**
 * Q7_2_Reverse_of_String
 *  Using StringBuilder
 */
public class Q7_2_Reverse_of_String
 {
    public static String  Reverse_of_String(String Str )
     {

        return Str;
    }
    public static void main(String[] args)
    {
        String s="Nishan shah";
        StringBuilder SB=new StringBuilder();
        SB.append(s);
        SB.reverse();
        System.out.println(SB);

    }
    
}