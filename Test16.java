import java.util.Scanner;
class Test16
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
float P,R,T;
P=sc.nextFloat();
R=sc.nextFloat();
T=sc.nextFloat();
float SI=(P*R*T)/100;
System.out.println("Simple Interest = " +SI);
}
}