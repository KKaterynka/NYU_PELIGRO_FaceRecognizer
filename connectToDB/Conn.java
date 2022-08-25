package com.mycompany.recognitionApp.connectToDB;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Conn {

    public Statement stm;

    public ResultSet rs;
    //private final String driver = "org.mysql.cj.Driver";

    private final String root = "jdbc:mysql://localhost:3306/facialrecognition";
    private final String user = "root";

    // no password for db
    private String password;

    public Connection conn;

    public void connect(){
        try{
            // load drivers and establish connection
            conn = DriverManager.getConnection(root, user, password);
            //System.out.println("Connected");
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }

    }

    public void disconnect(){
        try{
            // close connection
            conn.close();
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }

    public void executeSQL(String SQL){
        try{
            // create and execute SQL statement
            //ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
        }catch (SQLException e){
            System.out.println("Error: " + e);
        }
    }

//    public static void main(String[] args){
//        Conn connection = new Conn();
//        connection.connect();
//    }

}
