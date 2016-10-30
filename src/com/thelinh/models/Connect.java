/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Admin
 */
public class Connect {
    private static Connection conn;
    public static Connection getConnect(){
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LibraryManagement","postgres","thelinh96");      
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return conn;
    }
     
 /*   
    
    public ResultSet getData(){
        ResultSet rs = null;
        String sql = "select * from Admin";
        Statement st;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Error"+ ex.toString());
        }
        return rs;
        
    }
    
    public void showData(ResultSet rs){
        try {
            while (rs.next()){
                System.out.printf("%10s %10s \n", rs.getString(1),rs.getString(2));
            }
        } catch (SQLException ex) {
            
        }
    }
    
    public static void main(String[] args){
        Connect cn = new Connect();
        cn.getConnect();
        cn.showData(cn.getData());
    }
    */
}
