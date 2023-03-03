import java.util.*;
class Rectangle
{
private double length;
private double breadth;
public Rectangle()
{
	length=breadth=0.0;
}
public Rectangle(double l,double b)
{
    length=l;
	breadth=b;
}
public void area()
	{
	System.out.println("Area of Rectangle is:" +(length*breadth));
	}
public void perimeter()
	{
	System.out.println("Perimeter of Rectangle is:" +2*(length+breadth));
	}
}
class RectangleDemo
{
public static void main(String []args)
	{
	Rectangle myRect=new Rectangle(5,6);
	Rectangle myRect1=new Rectangle();
	myRect.area();
	myRect.perimeter();
	myRect1.area();
	myRect1.perimeter();
	}
}