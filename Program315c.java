import java.util.*;
public class Program315c
{
 static double area_of_a_square(double side)
 { 
    return side*side;
 }
 public static void main(String []args)
 { 
   double side;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the side of the square");
   side=sc.nextDouble();
   System.out.println("Area of the Square:" +area_of_a_square(side));
 }
}