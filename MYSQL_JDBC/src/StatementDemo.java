import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

class Student{
    int id;
    String name;
    int age;
    double marks;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
public class StatementDemo {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/mydb";
    private static final String userName="neha";
    private static final String password="Ofib4Mnfar5@1";

    public static void main(String[] args)  {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(url);
        dataSource.setUser(userName);
        dataSource.setPassword(password);

//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        }catch (ClassNotFoundException e){
//            System.out.println(e);
//        }

        try{
//            Connection connection= DriverManager.getConnection(url,userName,password);
            Connection connection = dataSource.getConnection();
            Statement stmt= connection.createStatement();

            //Insert into db
//            String insert=String.format("insert into students(name,age,marks) values('%s',%d,%f)","Safi",29,90.0);
//            int rowsInserted= stmt.executeUpdate(insert);
//            if (rowsInserted > 0){
//                System.out.println("Data is inserted into db");
//            }

            //Update data in db
//            String update= String.format("UPDATE students SET name='%s',marks=%f where id=%d","zoya",85.0,2  );
//            int rowsUpdated= stmt.executeUpdate(update);
//            if (rowsUpdated > 0){
//                System.out.println("Data is updated into db");
//            }

            //Delete from db
//            String delete=String.format("DELETE FROM students WHERE id=%d",5);
//            int rowDeleted=stmt.executeUpdate(delete);
//            if (rowDeleted > 0){
//                System.out.println("Row is successfully deleted");
//            }

            //Query from db
            String query="select * from students";
            ResultSet result=stmt.executeQuery(query);
            Student s= new Student();
            while (result.next()){
                s.id= result.getInt("id");
                s.name= result.getString("name");
                s.age= result.getInt("age");
                s.marks=result.getInt("marks");
                System.out.println(s);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}