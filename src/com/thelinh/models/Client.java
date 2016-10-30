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
public class Client {
    private String clientId;
    private String clientPassword;
    private String fullName;
    private Date birthDay;
    private String address;
    private String phone;

    public Client(String clientId, String clientPassword, String fullName, Date birthDay, String address, String phone) {
        this.clientId = clientId;
        this.clientPassword = clientPassword;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}
