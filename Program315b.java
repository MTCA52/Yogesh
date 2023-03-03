import java.util.*;
public class Program315b
{
static double area_of_a_rectangle(double length,double breadth)
	{
	return length*breadth;
	}
 public static void main(String []args)
	{
	 double length,breadth;
	 System.out.println("Enter the length & breadth of the Rectangle:");
	 Scanner sc=new Scanner(System.in);
	 length=sc.nextDouble();
     breadth=sc.nextDouble();
	 System.out.println("Area of the Rectangle:" +area_of_a_rectangle(length,breadth));
	}
}
