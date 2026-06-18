package JDBC.Statements;
import java.sql.*;
public class Jdbcinsert {
    private static final String url="jdbc:mysql://localhost:3306/sms2";
    private static final String userName="root";
    private static final String password="Divya@2006";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        String query = String.format("insert into students(id,name,email,marks)values(%d,'%s','%s',%d)",3,"ds","ds@gmail.com",2006);
        int res=st.executeUpdate(query);
        if(res>0){
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }
    }
}
