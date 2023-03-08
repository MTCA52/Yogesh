import java.util.Arrays;
import java.util.Scanner;
public class SumOfAnArray {
   public static void main(String args[]){
      System.out.println("Enter the  size of an array :: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      int sum = 0;
      System.out.println("Enter the elements of an array: ");

      for(int i=0; i<size; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("Elements of an array are: "+Arrays.toString(myArray));
      System.out.println("Sum of the elements of an array ::"+sum);
   }

}