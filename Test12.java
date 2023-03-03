import java.util.Scanner;
class Point
{
double x;
double y;
Point()
{
x=0;
y=0;
}
Point(double x1,double y1)
{
x=x1;
y=y1;
}
public double distance_from_origin()
{
double dist;
dist=Math.sqrt(x*x+y*y);
return dist;
}
public double distance_from_point(Point Q)
{
double diff_x=x-Q.x;
double diff_y=y-Q.y;
return Math.sqrt(diff_x*diff_x + diff_y*diff_y);
}
public void translate(double x_trans,double y_trans)
{
x=x+x_trans;
y=y+y_trans;
}
} 
class Test12
{
public static void main(String []args)
{
double x1,y1,x2,y2,res;
Scanner sc=new Scanner(System.in);
Point ob=new Point();
res=ob.distance_from_origin();
System.out.println("Distance of point from origin is " +res);
}
}