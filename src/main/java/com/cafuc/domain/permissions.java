package com.cafuc.domain;

public class permissions {
    private int Eid;
    private String Ename;
    private Category ECategory;
    private Type EType;
    private Manager EManager;
    private String eStatus;

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public Category getECategory() {
        return ECategory;
    }

    public void setECategory(Category ECategory) {
        this.ECategory = ECategory;
    }

    public Type getEType() {
        return EType;
    }

    public void setEType(Type EType) {
        this.EType = EType;
    }

    public Manager getEManager() {
        return EManager;
    }

    public void setEManager(Manager EManager) {
        this.EManager = EManager;
    }

    public String geteStatus() {
        return eStatus;
    }

    public void seteStatus(String eStatus) {
        this.eStatus = eStatus;
    }
}
