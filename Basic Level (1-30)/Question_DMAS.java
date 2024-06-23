// Simple Calculator (Addition, Subtraction, Multiplication, Division)
/**
 * Question_DMAS
 */
import java.util.Scanner;

public class Question_DMAS
 {
     static float x,y;
     static void Multiplication(float x, float y)
     {
        float result=x*y;
        System.out.println( "Multiplication of two number :"+x +" and "+ y+" is ="+result);

        
     }
     static void Division(float x, float y)
     {
        float result=x/y;
        System.out.println( "Division of two number :"+x +" and "+ y+" is ="+result);

     }
     static void Subtraction(float x, float y)
     {
        float result=x-y;
        System.out.println( "Subtraction of two number :"+x +" and "+ y+" is ="+result);


     }
     static void Addition(float x, float y)
     {
        float result=x+y;
        System.out.println( "Addition of two number :"+x +" and "+ y+" is ="+result);

     }
    //  static float GetValue()
    //  {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter value x");
    //     // Float x=(float) sc.nextInt();
    //     float x=sc.nextFloat();
    //     System.out.println("Enter value y");
    //     float y=sc.nextFloat();
    //     return 0;
    //  }
    public static void main(String[] args) 
    {
     
        // GetValue();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value x");
        // Float x=(float) sc.nextInt();
        float x=sc.nextFloat();
        System.out.println("Enter value y");
        float y=sc.nextFloat();
        System.out.println(x);
        System.out.println(y);
        int option;
      

 while (true)
  {
    System.out.println("Choose option \n 1.Addition \n 2.Subtraction \n 3.Mutliplication \n 4.Division \n 5.exit" );
 option=sc.nextInt();
     switch (option)
        {
           
            case 1:
            // System.out.println("Enter 1 for Addition");
            Addition(x,y);

                
                break;
            case 2:
            // System.out.println("Enter 2 for Subtraction");
            Subtraction(x,y);
                break;
            case 3:
            // System.out.println("Enter 1 for Multiplication");
            Multiplication(x,y);
                break;
            case 4:
            // System.out.println("Enter 1 for Division");
            Division(x,y);
                break;
                case 5:
                {
                    System.out.println("Exiting calculator. Goodbye!");
                    sc.close(); // Close the scanner before exiting
                    return ; // Exit the main method

                }
     
            default:
          System.out.println("Enter valid Range");
                break;
       }
    }
    
 }
      
}