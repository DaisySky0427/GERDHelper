package com.example.daisy.gerdhelper.db;
import org.litepal.crud.DataSupport;

public class PatientInfo extends DataSupport {
    private int patId;
    private String patName;
    private int patGender;
    private int patAge;
    private String patSate;
    private int docId;
    private int acntId;

    public int getPatId() {
        return patId;
    }

    public void setPatId(int patId) {
        this.patId = patId;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public int getPatGender() {
        return patGender;
    }

    public void setPatGender(int patGender) {
        this.patGender = patGender;
    }

    public int getPatAge() {
        return patAge;
    }

    public void setPatAge(int patAge) {
        this.patAge = patAge;
    }

    public String getPatSate() {
        return patSate;
    }

    public void setPatSate(String patSate) {
        this.patSate = patSate;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }
}