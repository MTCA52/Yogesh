import java.util.*;
class Program501a
{
static double calculateArea(double b,double h)
{
double temp;
temp=1.0/2.0*b*h;
return temp;
}
public static void main(String []args)
{
double base,height,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter base of the right angled triangle:");
base=sc.nextDouble();
System.out.println("Enter height of the right anglrd triangle:");
height=sc.nextDouble();
area=calculateArea(base,height);
System.out.println("Area of Triangle with base" +base+ "height" +height+ "is" +area+ "sq unites");
}
}