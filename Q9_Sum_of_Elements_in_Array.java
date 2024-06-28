import java.util.Scanner;

/**
 * Q9_Sum_of_Elements_in_Array
 * 
 */
public class Q9_Sum_of_Elements_in_Array
 {

    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int list[]=new int[size]; //methord 1
        // int list[]={1,2,3,4,5}; //methord 2
       
        for(int a=0;a<size;a++)
        {
            //This loop is use to get the value from the user.
            System.out.println("Enter integer in an array list at ["+a+"]");
            list[a]=sc.nextInt();
        }
        int sum=0;
        System.out.println("The Enter array is :\"");
        for(int i=0;i<list.length;i++)
        {
            System.out.print("\t" +list[i] ); //Display the array list that user have entered
            sum=list[i]+sum;
        }
        System.out.println( " \" \n the sum of the array is :"+sum);
    } 
}