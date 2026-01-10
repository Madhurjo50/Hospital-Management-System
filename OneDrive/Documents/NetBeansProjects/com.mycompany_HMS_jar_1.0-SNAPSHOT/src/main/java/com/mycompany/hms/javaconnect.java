
package com.mycompany.hms;

import java.sql.*;
public class javaconnect {
    Connection conn;
    public static Connection connectDB(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
        System.out.println("Connection Successfull");
        return conn;
    }
    catch(Exception e){
        System.out.println(e);
        return null;
    }}
    public static void main(String[] args) {
        connectDB();
    }
}
