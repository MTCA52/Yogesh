import java.util.*;
class Triangle
{
private double base;
private double height;
public Triangle()
{
 base=height=0.0;
}
public Triangle(double b,double h)
{
  base=b;
  height=h;
}
public void volume()
{
System.out.println("Area of Right Angled Triangle: " +(1.0/2.0*base*height));
}
}
class TriangleDemo
{
public static void main(String []args)
{
Triangle myTri1=new Triangle();
Triangle myTri2=new Triangle(60,45);
myTri1.volume();
myTri2.volume();
}
}
