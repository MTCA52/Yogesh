import java.util.*;
class MyDate
{
private int day;
public int month;
public int year;
public int get_day()
{
return day;
}
public void set_day(int d)
{
	day=d;
}
}
class Test1
{
public static void main(String []args)
{
MyDate ob1=new MyDate();
ob1.set_day(10);
ob1.month=2;
ob1.year=2023;
System.out.println(ob1.get_day()+ "-"+ob1.month+ "-"+ob1.year);
}
}

