import java.sql.*;

public class Conn{
    Connection con;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_management_system?","root","Zaid@123");
            s =con.createStatement();
        }catch(Exception e){
            System.out.println("database error" + e);
        }
    }
}
