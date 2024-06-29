/**
 * Q12_Count_Vowels_in_a_String
 */
public class Q12_Count_Vowels_in_a_String
 {
 public static void main(String[] args) 
 {
    String string="Hello world ,welcome to java basic to Advance course";
    char ch;
    int vowelCount=0;
    System.out.print(" The vowels letters are given below \n \" ");
     for(int i=0;i<string.length();i++)
     {
        ch=string.charAt(i);
       
        if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.print(ch);
            vowelCount++;
        }
        // System.out.println(ch);
     }  
     System.out.print("  \" \n");
     System.out.println("The Total Vowels are :"+vowelCount);
 }
    
}