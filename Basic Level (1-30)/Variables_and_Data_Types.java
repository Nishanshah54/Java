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
        }
    
}