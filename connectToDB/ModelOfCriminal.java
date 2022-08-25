/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recognitionApp.connectToDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ModelOfCriminal {
    
    Conn connection = new Conn();
    
    private static int id;
    private String firstName;
    private String lastName;
    private String dob;
    private String age;
    private String gender;
    private String phone_numnber;
    private String city;
    private String state;

    public ModelOfCriminal(){
    }
    
    public ModelOfCriminal(String firstName, String lastName, 
            String dob, String age, String gender, String phone_numnber,
            String city, String state){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.phone_numnber = phone_numnber;
        this.city = city;
        this.state = state;
    }
    
    public int getId(){
        return id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getDob(){
        return dob;
    }
    
    public String getAge(){
        return age;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getPhoneNumnber(){
        return phone_numnber;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getState(){
        return state;
    }

    
    public void setID(int id){
        this.id = id;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setDob(String dob){
        this.dob = dob;
    }
    
    public void setAge(String age){
        this.age = age;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setPhoneNumnber(String phone_numnber){
        this.phone_numnber = phone_numnber;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setState(String state){
        this.state = state;
    }

    
    public void insert(){
        try {
            connection.connect();
            PreparedStatement prepStm = connection.conn.prepareStatement("INSERT INTO criminal (id, first_name, last_name, dob,"
                    + "age, gender, phone_number, city, state) values (?, ?, ?, ?, ?, ?, ?, ?,?)");
            prepStm.setInt(1, this.getId());
            prepStm.setString(2, this.getFirstName());
            prepStm.setString(3, this.getLastName());
            prepStm.setString(4, this.getDob());
            prepStm.setString(5, this.getAge());
            prepStm.setString(6, this.getGender());
            prepStm.setString(7, this.getPhoneNumnber());
            prepStm.setString(8, this.getCity());
            prepStm.setString(9, this.getState());
            prepStm.executeUpdate();
            connection.disconnect();
            System.out.println("#" + this.getId() + " Registered " + this.getFirstName() + " " + this.getLastName());
            
        } catch (SQLException ex) {
            Logger.getLogger(ModelOfCriminal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
