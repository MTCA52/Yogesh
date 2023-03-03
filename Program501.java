import java.util.*;
class Program501
{
static double area_of_a_triangle(double base, double height)
{
return 0.5*base*height;
}
public static void main(String []args)
{ 
double base,height;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Base of Rectangle:");
base=sc.nextDouble();
System.out.println("Enter the Height of Rectangle:");
height=sc.nextDouble();
System.out.println("Area of the Triangle:" +area_of_a_triangle(base,height));
}
}
