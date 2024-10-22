import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class BatchProcessingStmntDemo {
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
            Statement stmt= connection.createStatement();
            Scanner sc= new Scanner(System.in);
            Student s= new Student();
            while (true){
                System.out.print("Enter name:");
                s.name= sc.nextLine();
                System.out.print("Enter age:");
                s.age=sc.nextInt();
                System.out.print("Enter Marks:");
                s.marks=sc.nextDouble();
                String insert=String.format("insert into students(name,age,marks) values('%s',%d,%f)",s.name,s.age,s.marks);
                stmt.addBatch(insert);
                System.out.print("Enter Y to enter more data , N to stop it: ");
                String choice= sc.next();
                if(choice.equalsIgnoreCase("N")){
                    break;
                }
                sc.nextLine();
            }

            int[] rowsInserted=stmt.executeBatch();
            for (int j:rowsInserted){
                if(j <=0){
                    System.out.println("Query "+j+" failed to insert ");
                }
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
