import java.util.Scanner;
class Number1
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
public boolean checkPrime()
{
if(this.num==1||this.num==2)return true;
for(int i=2;i<this.num;i++)
{
if(this.num%i==0)return false;
}
return true;
}
}
class Test
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int count=0;
System.out.println("Enter a Number:");
int size=sc.nextInt();
int[]numList=new int[size];
int[]numPrime=new int[size];
System.out.println("Enter " + size + "numbers:");
for(int i=0;i<size;i++)
{
numList[i]=sc.nextInt();
}
Number1 ob1=new Number1();
for(int i=0;i<size;i++)
{
ob1.setNum(numList[i]);
if(ob1.checkPrime())
{
numPrime[i]=ob1.getNum();
count++;
}
else
{
numPrime[i]=0;
}
}
for(int i=0;i<size;i++)
{
if(numPrime[i]!=0)
System.out.print(numPrime[i]+ ",");
}
System.out.print("\n Total Prime Numbers in input arrays " +count);
}
}