import java.util.Scanner;
class Number2
{
private int num;
public void setNum(int num)
{
this.num=num;
}
public int getNum()
{
return this.num;
}
public int checkLength()
{
int n=this.num;
if(n<0)n=-n;
if(n==0)return 1;
int len=0;
while(n>0)
{
n=n/10;
len++;
}
return len;
}
}
class Test
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number:");
int temp=sc.nextInt();
Number2 ob=new Number2();
ob.setNum(temp);
System.out.println("\n" + ob.checkLength());
}
}