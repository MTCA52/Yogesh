import java.util.Scanner;
class Test17
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
double Principal,Rate,Time;
Principal=sc.nextDouble();
Rate=sc.nextFloat();
Time=sc.nextFloat();
double CI=Principal*(Math.pow((1+Rate/100),Time));
System.out.println("Compound Interest = " +CI);
}
}