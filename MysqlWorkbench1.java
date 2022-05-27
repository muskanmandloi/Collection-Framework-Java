import java.sql.*;
import java.io.*;
public class MysqlWorkbench1
{
public static void main(String ag[])
{
Connection con;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech","root","java@1520");
Statement st = con.createStatement();
System.out.println("Connection Established Successfully!!");
st.executeUpdate ("CREATE TABLE EMPLOYEE" + "(EMPLOYEE_Name VARCHAR(32),EMPLOYEE_ID INTEGER,SALARY FLOAT,DATE_of_HIRED DATE,TOTAL_YEAR INTEGER)");
}

catch(ClassNotFoundException e)

{
System.out.println(e.toString());

}

catch(SQLException e)
{
System.out.println(e.toString());
}
}

}