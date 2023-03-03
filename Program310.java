import java.util.Scanner;
public class Program310
{
static void displayMonth(int month_no)
{
String s=new String();
if(month_no==0)s="January";
if(month_no==1)s="February";
if(month_no==2)s="March";
if(month_no==3)s="April";
if(month_no==4)s="May";
if(month_no==5)s="June";
if(month_no==6)s="July";
if(month_no==7)s="August";
if(month_no==8)s="September";
if(month_no==9)s="October";
if(month_no==10)s="November";
if(month_no==11)s="December";
if(month_no<0 ||month_no>11)s="Incorrect month number";
System.out.println("Month is:" +s);
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month numbers(0-11):");
int month_no=sc.nextInt();
displayMonth(month_no);
}
}