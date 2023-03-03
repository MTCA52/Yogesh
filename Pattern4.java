import java.util.*;
class Pattern4
{
static void printPattern(char ch,int n)
{
for(int i=5;i>=n;i--)
{
System.out.print(ch);
}
System.out.print("\n");
}
public static void main(String []args)
{
printPattern('#',1);
printPattern('#',2);
printPattern('#',3);
printPattern('#',4);
printPattern('#',5);
}
}