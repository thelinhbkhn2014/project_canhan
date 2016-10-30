/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.controller;

import com.thelinh.models.Detail;
import com.thelinh.models.CheckOut;
import com.thelinh.models.Admin;
import com.thelinh.models.Book;
import com.thelinh.models.Client;
import com.thelinh.models.AdminSql;
import com.thelinh.models.BookSql;
import com.thelinh.models.CheckOutSql;
import com.thelinh.models.ClientSql;
import com.thelinh.models.DetailSql;

/**
 *
 * @author Admin
 */
public class Controller {
    //Amin
    public static Admin signIn(String Id, String Password){
        return AdminSql.signIn(Id, Password);
    }
    
    
    //Client
    public static Client signInClient(String clientId, String clientPassword){
        return ClientSql.signIn(clientId, clientPassword);
    }
    
    public static void insertClient(Client cl){
        ClientSql.insertClient(cl);
    }
    
    public static boolean updateClient(Client cl){
        return ClientSql.updateClient(cl);
    }
    
    public static boolean deleteClient(String clientId){
        return ClientSql.deleteClient(clientId);
    }
    
    
    //Book
    public static void insertBook(Book bk){
        BookSql.insertBook(bk);
    }
    
    public static boolean updateBook(Book bk){
        return BookSql.updateBook(bk);
    }
    
    public static boolean deleteBook(String bookId){
        return BookSql.deleteBook(bookId);
    }
    
    
    //CheckOut
    public static void insertCheckOut(CheckOut co){
        CheckOutSql.insertCheckOut(co);
    }
    
    public static boolean updateCheckOut(CheckOut co){
        return CheckOutSql.updateCheckOut(co);
    }
    
    public static boolean deleteCheckOut(String checkOutId){
        return CheckOutSql.deleteCheckOut(checkOutId);
    }
    
    
    //Detail
    public static void insertDetail(Detail co){
        DetailSql.insertDetail(co);
    }
    
    public static boolean updateDetail(Detail co){
        return DetailSql.updateDetail(co);
    }
    
    public static boolean deleteDetail(String checkOutId,String bookId){
        return DetailSql.deleteDetail(checkOutId, bookId);
    }
    
    
}
