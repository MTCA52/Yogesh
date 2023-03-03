import java.util.Scanner;
class Number
{
private int n1;
public void setn1(int n1)
{
this.n1=n1;
}
public int getn1()
{
return this.n1;
}
public int sumDigit()
{
int sum=0;
int n=this.n1;
while(n>0)
{
sum=sum+n%10;
n=n/10;
}
return sum;
}
}
class Test7
{
public static void main(String []args)
{
Number ob1=new Number();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers:");
int temp=sc.nextInt();
ob1.setn1(temp);
int res=ob1.sumDigit();
System.out.println("Sum of digits of"+ob1.getn1()+"is"+res);
}
}

