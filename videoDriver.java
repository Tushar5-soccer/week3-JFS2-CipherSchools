create database books;
        use booksdb;

        create table books (
        book_id int primary key,
        title varchar(255),
        author varchar(255),
        piece int
        );

        select * from books;




///////Java code//////
import java.sql.DriverManager;
public class Test0{
    public static void main(String[] args){
        //lab1 establishing connection with mysql server
        try{
            //step1: load the driver
            Class.forName("com.mysql.c.jdbc.Driver");
            //step2: create the connection object
            String connectionURL="jdbc:mysql://localhost/booksdb";

            Connection conn = DriverManager.getConnection(connectionURL,"root","<passwordhere>");

            System.out.println("Connected to Server Successfully!!!");
        }
        catch(Exception e){


        }
    }

}