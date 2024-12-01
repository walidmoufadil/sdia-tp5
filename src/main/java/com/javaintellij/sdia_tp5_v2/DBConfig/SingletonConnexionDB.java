package com.javaintellij.sdia_tp5_v2.DBConfig;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnexionDB {
    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection().isClosed());
    }
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/depart_management","root","walid123");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
