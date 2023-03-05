import java.util.*;
class Test15
{
static boolean isNumber(String s)
{
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i))==false)
{
return false;
}
}
return true;
}
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
if(isNumber(str))
System.out.println("Integer");
else
System.out.println("String");
}
}
