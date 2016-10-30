/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class BookSql {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static void insertBook(Book bk){
        String sql = "INSERT INTO Book VALUES(?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, bk.getBookId());
            ps.setString(2, bk.getBookName());
            ps.setString(3, bk.getAuthorName());
            ps.setString(4, bk.getPublishingCompany());
            ps.setString(5, bk.getCategory());
            ps.setInt(6, bk.getPrice());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add Successfull", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"EROR: Unsuccessful", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static boolean updateBook(Book bk){
        String sql = "UPDATE Book SET BookName = ?, AuthorName = ?, PublishingCompany = ?, Price = ?, Category = ? WHERE BookId = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, bk.getBookName());
            ps.setString(2, bk.getAuthorName());
            ps.setString(3, bk.getPublishingCompany());
            ps.setInt(4, bk.getPrice());
            ps.setString(5, bk.getCategory());
            ps.setString(6, bk.getBookId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static boolean deleteBook(String bookId){
        String sql = "DELETE FROM Book WHERE BookId = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, bookId);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static ResultSet display(String sql){
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
}
