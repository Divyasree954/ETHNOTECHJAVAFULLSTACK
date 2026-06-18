package JDBC.PreparedStatements;

import java.sql.*;

public class preparedstatementdemo {
    private static final String url = "jdbc:mysql://localhost:3306/sms2";
    private static final String userName = "root";
    private static final String password = "Divya@2006";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        String query = "select * from students";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            int marks = rs.getInt("marks");
            System.out.println(id);
            System.out.println(name);
            System.out.println(email);
            System.out.println(marks);

        }
    }
}
