import java.sql.*;
class OracleCon2
{
public static void main(String []args)
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcaa2252","mtcaa2252");
Statement stmt=con.createStatement();
String s;
s="insert into student1"+"(rollno,sname,age)"+"values(98,'test51',88)";
ResultSet rs=stmt.executeQuery(s);
stmt.executeUpdate(s);
while(rs.next())
System.out.println("One record inserted");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}