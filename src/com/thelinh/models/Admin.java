/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.models;

/**
 *
 * @author Admin
 */
public class Admin {
    private String Id;
    private String Password;

    public Admin(String Id, String Password) {
        this.Id = Id;
        this.Password = Password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}
