package JDBC.PreparedStatements;
import java.sql.*;
public class PSUpdate {
    private static final String url="jdbc:mysql://localhost:3306/sms2";
    private static final String userName="root";
    private static final String password="Divya@2006";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        String query = "update students set marks=? where id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,70);
        ps.setInt(2,4);
        int res=ps.executeUpdate();
        if(res>0){
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }
    }
}
