import java.util.Scanner;
class Number
{
static int GCD(int u, int v)
{
if(u==0) 
return v;
return GCD(v% u,v);
}
static int LCM(int u,int v)
{
return(u/GCD(u,v))*v;
}
public static void main(String []args)
{
int u,v;
Scanner sc=new Scanner(System.in);
u=sc.nextInt();
v=sc.nextInt();
System.out.println("LCM of " + u + " and " +v + " is " + LCM(u,v));
}
}