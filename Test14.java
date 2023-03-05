class Student
{
private int id;
private String name;
private String course;
public void display()
{
System.out.println(id+ "," +name+ "," +course);
}
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public void setCourse(String course)
{
this.course=course;
}
}
     class Test14
	 {
    public static void main(String []args)
		 {
		Student obs1=new Student();
     obs1.setId(27633);
   obs1.setName("Yogesh");
     obs1.setCourse("MCA");
	 obs1.display();
}
}

