import java.util.*;
public class Program315a
{
static double perimeter_of_a_circle(double radius)
{
return 2*Math.PI*radius;
}
public static void main(String []args)
{
double radius;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of circle:");
radius=sc.nextDouble();
System.out.println("Perimeter of the circle:" +perimeter_of_a_circle(radius));
}
}