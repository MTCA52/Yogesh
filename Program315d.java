import java.util.*;
public class Program315d
{
 static double perimeter_of_a_square(double side)
 { 
    return 4*side;
 }
 public static void main(String []args)
 { 
   double side;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the side of the square");
   side=sc.nextDouble();
   System.out.println("Perimeter of the Square:" +perimeter_of_a_square(side));
 }
}