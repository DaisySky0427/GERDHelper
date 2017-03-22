package com.example.daisy.gerdhelper.db;
import org.litepal.crud.DataSupport;

public class Account extends DataSupport{
    private int acntId;
    private String acntLoginID;
    private String acntPassword;
    private String acntEmail;
    private int acntType;

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public String getAcntLoginID() {
        return acntLoginID;
    }

    public void setAcntLoginID(String acntLoginID) {
        this.acntLoginID = acntLoginID;
    }

    public String getAcntPassword() {
        return acntPassword;
    }

    public void setAcntPassword(String acntPassword) {
        this.acntPassword = acntPassword;
    }

    public String getAcntEmail() {
        return acntEmail;
    }

    public void setAcntEmail(String acntEmail) {
        this.acntEmail = acntEmail;
    }

    public int getAcntType() {
        return acntType;
    }

    public void setAcntType(int acntType) {
        this.acntType = acntType;
    }
}