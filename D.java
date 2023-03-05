//Hybrid Inhritance
import java.util.*;
class C
{
public void dispC()
{
System.out.println("Method of class C");
}
}
class A extends C
{
public void dispA()
{
System.out.println("Method of class A");
}
}
class B extends C
{
public void dispB()
{
System.out.println("Method of class B");
}
}
class D extends A
{
public void dispD()
{
System.out.println("Method of class D");
}
public static void main(String []args)
{
D obj=new D();
obj.dispD();
obj.dispA();
obj.dispC();
}
}