import java.util.Scanner;
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
class Test6
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
MyDate ob1=new MyDate();
int d,m,y;
System.out.println("Enter the Day:");
d=sc.nextInt();
System.out.println("Enter the Month:");
m=sc.nextInt();
System.out.println("Enter the Year:");
y=sc.nextInt();
ob1.set_day(d);
ob1.set_month(m);
ob1.set_year(y);
System.out.println(ob1.get_day()+ "-"+ob1.get_month()+ "-"+ob1.get_year());
}
}