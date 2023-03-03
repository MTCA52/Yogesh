import java.util.*;
class scope_example
{
public static void main(String []args)
{
System.out.println("This is example to understand scope of variable");
int i;
i=15;
{
System.out.println("We are in a new block");
int j;
j=10;
j=i*i;
System.out.println("i and j in new block are "+i+" "+j);
}
int k;
k=i+2;
int j;
j=k+100;
System.out.println("i and j out of the new block are "+i+" "+j);
}
}