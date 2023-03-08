import java.util.*;
class SumNumbers
{
private int n;
public void set(int n)
{this.n=n;
}//set
public int get()
{
return n;
    }//get
public int digit()
{
int sum=0;
while(n>0)
{sum=sum+n%10;
   n=n/10;
}//while
return sum;
}//digit
}//sumn
class SumArray
{
public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
int n1;
System.out.print("Enter the Digit: ");
n1=sc.nextInt();
int[] ar=new int[n1];
int[] sum=new int[n1];
System.out.println("Enter numbers:");
for (int i=0;i<n1;i++)
{
ar[i]=sc.nextInt();
}
SumNumbers s=new SumNumbers();
for (int i=0;i<n1;i++)
{
s.set(ar[i]);
int res=s.digit();

      System.out.println("The sum of Given Digits is "+res);
}
}//main
}//sumarray