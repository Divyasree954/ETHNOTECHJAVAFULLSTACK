package JDBC.Statements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcupdate {
        private static final String url="jdbc:mysql://localhost:3306/sms2";
        private static final String userName="root";
        private static final String password="Divya@2006";
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();
            String query = String.format("update students  SET marks=%d where id=%d",95,3);
            int res=st.executeUpdate(query);
            if(res>0){
                System.out.println("success");
            }
            else{
                System.out.println("failed");
            }
        }
}



