/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.models;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Detail {
    private String checkOutId;
    private String bookId;
    private Date borrowingDay;
    private Date payDay;
    private int deposit;
    private Date deadLine;
    private int amercement;

    public Detail(String checkOutId, String bookId, Date borrowingDay, Date payDay, int deposit, Date deadLine,int amercement) {
        this.checkOutId = checkOutId;
        this.bookId = bookId;
        this.borrowingDay = borrowingDay;
        this.payDay = payDay;
        this.deposit = deposit;
        this.deadLine = deadLine;
        this.amercement = amercement;
    }

    public String getCheckOutId() {
        return checkOutId;
    }

    public void setCheckOutId(String checkOutId) {
        this.checkOutId = checkOutId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getBorrowingDay() {
        return borrowingDay;
    }

    public void setBorrowingDay(Date borrowingDay) {
        this.borrowingDay = borrowingDay;
    }

    public Date getPayDay() {
        return payDay;
    }

    public void setPayDay(Date payDay) {
        this.payDay = payDay;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public int getAmercement() {
        return amercement;
    }

    public void setAmercement(int amercement) {
        this.amercement = amercement;
    }
    
    
}
