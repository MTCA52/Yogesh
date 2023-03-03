import java.util.*;
class Box
{
double width;
double height;
double depth;
}
class BoxDemob
{
public static void main(String []args)
{
Box mybox=new Box();
double vol;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Width: ");
mybox.width=sc.nextDouble();
System.out.println("Enter the Height: ");
mybox.height=sc.nextDouble();
System.out.println("Enter the Depth: ");
mybox.depth=sc.nextDouble();
vol= mybox.width *mybox.height *mybox.depth;
System.out.println("Volume is " +vol);
}
}