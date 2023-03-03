import java.util.*;
class MyDate
{
private int day;
private int month;
private int year;
public int get_day()
{
return day;
}
public void set_day(int d)
{
day=d;
}
public int get_month()
{
return month;
}
public void set_month(int m)
{
month=m;
}
public int get_year()
{
return year;
}
public void set_year(int y)
{
year=y;
}
}
class Test4
{
public static void main(String []args)
{
MyDate ob1=new MyDate();
ob1.set_day(10);
ob1.set_month(2);
ob1.set_year(2023);
System.out.println(ob1.get_day()+ "-"+ob1.get_month()+ "-"+ob1.get_year());
}
}