import java.sql.*;
import java.io.*;
public class JDBCFIRST
{
public static void main(String ag[])
{
Connection con;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:Temp");
Statement st = con.createStatement();
st.executeUpdate ("CREATE TABLE EMP" + "(EMP_Name VARCHAR(32),EMP_ID INTEGER,SALARY FLOAT,DATE_of_HIRED DATE,TOTAL_YEAR INTEGER)");
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
