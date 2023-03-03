import java.util.*;
class Student
{
int rollno;
String name;
static String college="ITS";
static void change()
{
college="MTCA";
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" " +name+" " +college);
}
}
class TestStaticMethod
{
public static void main(String []args)
{
Student.change();
Student s1=new Student(111,"Yogesh");
Student s2=new Student(222,"Vinod");
Student s3=new Student(333,"Ajay");
s1.display();
s2.display();
s3.display();
}
}
