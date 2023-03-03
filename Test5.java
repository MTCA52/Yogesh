import java.util.Scanner;
class MyDate
{
public int day;
public int month;
public int year;
}
class Test5
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
MyDate ob1=new MyDate();
System.out.println("Enter the Day:");
ob1.day=sc.nextInt();
System.out.println("Enter the Month:");
ob1.month=sc.nextInt();
System.out.println("Enter the Year:");
ob1.year=sc.nextInt();
System.out.println(ob1.day+ "-"+ob1.month+ "-"+ob1.year);
}
}