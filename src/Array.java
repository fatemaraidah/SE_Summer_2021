import java.util.Arrays;
import java.util.Scanner;
public class Array123
{
    public static void main (String[] args )
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = s.nextInt();
        int myArray[] = new int[length];
        System.out.println("Enter the elements: ");
        
        for(int i=0; i<length; i++)
        {
            myArray[i]= s.nextInt();
             sum = sum + myArray[i]
        }
         System.out.println(Arrays.toString(myArray));
    }
   
}       
