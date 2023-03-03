import java.util.*;
class Box
{
double width;
double height;
double depth;
}
class BoxDemo
{
public static void main(String []args)
{
Box mybox=new Box();
double vol;
mybox.width = 100;
mybox.height = 200;
mybox.depth = 150;
vol= mybox.width *mybox.height *mybox.depth;
System.out.println("Volume is " +vol);
}
}