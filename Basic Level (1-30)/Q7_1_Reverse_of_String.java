/**
 * Reverse_of_String
 * Using a Loop
 */
public class Q7_1_Reverse_of_String
 {
    static String Reverse_of_String( String s)
    {
        String Nstr="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            Nstr=ch+Nstr;
        }
        return Nstr;

    }
    public static void main(String[] args) 
    {
        String str="This a String in java";
       String Rev= Reverse_of_String(str);
       System.out.println("ORIGINAL Message:"+str);
       System.out.println("Reverse Message:"+Rev);
       

    }    
}