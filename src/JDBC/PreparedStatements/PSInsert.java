package JDBC.PreparedStatements;
import java.sql.*;
public class PSInsert {
    private static final String url="jdbc:mysql://localhost:3306/sms2";
    private static final String userName="root";
    private static final String password="Divya@2006";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        String query = "insert into students(id,name,email,marks)values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,4);
        ps.setString(2,"Divya");
        ps.setString(3,"Divya@gmail.com");
        ps.setInt(4,23);
        int res=ps.executeUpdate();
        if(res>0){
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }
    }
}
