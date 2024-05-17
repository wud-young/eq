package com.cafuc.domain;

public class Type {
    private int ET_id;
    private String ET_name;
    private String ET_remark;

    @Override
    public String toString() {
        return "Type{" +
                "ET_id=" + ET_id +
                ", ET_name='" + ET_name + '\'' +
                ", ET_remark='" + ET_remark + '\'' +
                '}';
    }

    public int getET_id() {
        return ET_id;
    }

    public void setET_id(int ET_id) {
        this.ET_id = ET_id;
    }

    public String getET_name() {
        return ET_name;
    }

    public void setET_name(String ET_name) {
        this.ET_name = ET_name;
    }

    public String getET_remark() {
        return ET_remark;
    }

    public void setET_remark(String ET_remark) {
        this.ET_remark = ET_remark;
    }
}
