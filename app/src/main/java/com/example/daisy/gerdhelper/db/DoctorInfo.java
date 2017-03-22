package com.example.daisy.gerdhelper.db;
import org.litepal.crud.DataSupport;

public class DoctorInfo extends DataSupport{
    private int docId;
    private String docName;
    private int acntId;

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }
}