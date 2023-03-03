import java.util.*;
class MyDate
{
public int day;
public int month;
public int year;
}
class Test
{
public static void main(String []args)
{
MyDate ob1=new MyDate();
ob1.day=10;
ob1.month=2;
ob1.year=2023;
System.out.println(ob1.day+ "-"+ob1.month+ "-"+ob1.year);
}
}