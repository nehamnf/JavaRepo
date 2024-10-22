import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessingPreparedDemo {
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
            Scanner sc= new Scanner(System.in);
            Student s= new Student();
            String insertQuery = "INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            PreparedStatement prpStmnt = connection.prepareStatement(insertQuery);

            while (true) {
                System.out.print("Enter name:");
                s.name= sc.nextLine();
                System.out.print("Enter age:");
                s.age=sc.nextInt();
                System.out.print("Enter Marks:");
                s.marks=sc.nextDouble();
                prpStmnt.setString(1, s.name);
                prpStmnt.setInt(2, s.age);
                prpStmnt.setDouble(3, s.marks);
                prpStmnt.addBatch();
                System.out.print("Enter Y to enter more data , N to stop it: ");
                String choice= sc.next();
                if(choice.equalsIgnoreCase("N")){
                    break;
                }
                sc.nextLine();
            }

            int[] rowsInserted=prpStmnt.executeBatch();
            for (int j:rowsInserted){
                if(j <=0){
                    System.out.println("Query "+j+" failed to insert ");
                }
            }

            String query= "SELECT * FROM students";
            prpStmnt=connection.prepareStatement(query);
            ResultSet result=prpStmnt.executeQuery();
            Student s1= new Student();
            while (result.next()){
                s1.id= result.getInt("id");
                s1.name= result.getString("name");
                s1.age= result.getInt("age");
                s1.marks=result.getInt("marks");
                System.out.println(s1);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
