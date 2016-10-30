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
public class CheckOut {
    private String checkOutId;
    private String clientId;

    public CheckOut(String checkOutId, String clientId) {
        this.checkOutId = checkOutId;
        this.clientId = clientId;
    }

    public String getCheckOutId() {
        return checkOutId;
    }

    public void setCheckOutId(String checkOutId) {
        this.checkOutId = checkOutId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    

    
    
}
