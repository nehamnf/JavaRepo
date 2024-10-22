import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public class PreparedStatementDemo {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/";
    private static final String userName="";
    private static final String password="";

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(url);
        dataSource.setUser(userName);
        dataSource.setPassword(password);

        try {
            Connection connection = dataSource.getConnection();
            String insertQuery="INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            PreparedStatement prpStmt= connection.prepareStatement(insertQuery);
//            prpStmt.setString(1,"Naseem");
//            prpStmt.setInt(2,57);
//            prpStmt.setDouble(3,99);
//            int rowInserted=prpStmt.executeUpdate();
//            if (rowInserted >0){
//                System.out.println("Data inserted into db");
//            }

//            String deleteQuery="DELETE FROM students WHERE id=?";
//            prpStmt=connection.prepareStatement(deleteQuery);
//            prpStmt.setInt(1,7);
//            int rowDeleted=prpStmt.executeUpdate();
//            if (rowDeleted >0){
//                System.out.println("Data deleted from db");
//            }

            String updateQuery="UPDATE students SET name=?,marks=? where id=?";
            prpStmt=connection.prepareStatement(updateQuery);
            prpStmt.setString(1,"Suhail");
            prpStmt.setDouble(2,92.0);
            prpStmt.setInt(3,10);
            int rowUpdated=prpStmt.executeUpdate();
            if (rowUpdated >0){
                System.out.println("Data updated in db");
            }

            String query="SELECT * FROM students";
            prpStmt= connection.prepareStatement(query);
            ResultSet result=prpStmt.executeQuery();
            Student s= new Student();
            while (result.next()){
                s.id= result.getInt("id");
                s.name= result.getString("name");
                s.age= result.getInt("age");
                s.marks=result.getInt("marks");
                System.out.println(s);
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
