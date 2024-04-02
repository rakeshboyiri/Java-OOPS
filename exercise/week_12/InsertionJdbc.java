import java.sql.*;
import java.util.Scanner;
public class InsertionJdbc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Database Reading connection");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
           

            Statement stmt = connect.createStatement();
           PreparedStatement del = connect.prepareStatement("delete from student");
           del.executeUpdate();
            PreparedStatement pstmt = connect.prepareStatement("insert into student (sid,sname,marks) values (?,?,?)");
            System.out.print("Enter the Id of the student : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name of the student : ");
            String name = sc.nextLine();
            System.out.print("Enter the marks : ");
            float marks = sc.nextFloat();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setFloat(3, marks);
            pstmt.executeUpdate();

            System.out.println("Inserted values successfully");
            ResultSet rs = stmt.executeQuery("select * from student");
            
            
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
            }
            connect.close();

        }catch(Exception e){
            System.out.println("Connection Failed");
        }
    }
}