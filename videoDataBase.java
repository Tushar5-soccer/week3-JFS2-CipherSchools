create database mart;
        use mart;

        create table customers(
        custormer_number int primary key,
        first_name varchar(225) not null,
        last_name varchar(255) not null,
        address varchar(225) null,
        city varchar(255) not null,
        );
        select * from customers;

        import java.sql.*;
public static void main(String[] args){
        String connectionURL="jdbc:mysql://localhost:3306/mart";
        Class.forName("com.mysql.jdbc.Driver");
        connection conn = DriverManager.getConnection(connectionURL);
        System.out.println("Connected to Server!!!");
        conn.close();
        }