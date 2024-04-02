import java.sql.*;
import java.util.Scanner;

public class RetriveData {
    public static void main(String[] args) {
        System.out.println("Database Reading connection");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
           

            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");

            
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
            }
            connect.close();

        }catch(Exception e){
            System.out.println("Connection Failed");
        }
    }
}
