 import java.util.Scanner;
class Number
{
private int num;
public void setNum(int num)
{
this.num=num;
}
public long productDigit()
{
long res=1;
int n=this.num;
while(n>0)
{
res=res*(n%10);
n=n/10;
}
return res;
}
public int calculateFactorial()
{
int n=this.num;
int result=1;
while(n>0)
{
if(n==0)
{
result=result*1; break;
}
else
{
result=result*n;
n=n-1;
}
}
return result;
}
}
class TestClass
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a non-negative integer:");
int temp=sc.nextInt();
Number ob=new Number();
if(temp>=0)
{
ob.setNum(temp);
System.out.println(ob.calculateFactorial());
System.out.println(ob.productDigit());
}
else 
{
System.out.println("INVALID");
}
}
}