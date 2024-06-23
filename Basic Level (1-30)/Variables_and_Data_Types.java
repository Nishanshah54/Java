/**
 * Variables_and_Data_Types
 */
public class Variables_and_Data_Types
 {
     static int St=100;
    public  static void Dispay_message()
    {
      System.out.println("Here , we will see th variables and Data_types");
    }
    static void Local_var()
    {
        int lo=10;
        System.out.println("local variable --->"+ lo);

    }
     static void AboutDataType()
     {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        double doublea=10000.2342342342423442432423423424;
            System.out.println("interger="+myNum);
            System.out.println("float="+myFloatNum);
            System.out.println("boolean="+myBool);
            System.out.println("char="+myLetter);
            System.out.println("String="+myText);
            System.out.println("double="+doublea);
     }
        public static void main(String[] args)
        {
                    Dispay_message();
            String Types ="'There are three types of variables in Java\r\n" + //
                                "                local variable\r\n" + //
                                "                instance variable\r\n" + //
                                "                static variable ;";
                System.out.println(Types);
                String Local_var="The variable which is define with body of the methord is local variable . \r\n"+
                
               "we can use this variable with the methord only and the other methord aren't aware that the variable exit. ";
               System.out.println(Local_var);
               System.out.println("example of local variable is :");
               Local_var();
               System.out.println( "static Variable ---> " +St );
               int instanceVar=20; //instance variable
               System.out.println("Instance Variable -->" + instanceVar);
               AboutDataType();
        }
    
}