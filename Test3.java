import java.util.*;
class MyDate
{
public int day;
public int month;
private int year;
public int get_year()
{
return year;
}
public void set_year(int y)
{
	year=y;
}
}
class Test3
{
public static void main(String []args)
{
MyDate ob1=new MyDate();
ob1.day=10;
ob1.month=2;
ob1.set_year(2023);
System.out.println(ob1.day+ "-"+ob1.month+ "-"+ob1.get_year());
}
}



