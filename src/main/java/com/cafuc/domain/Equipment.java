package com.cafuc.domain;

public class Equipment {
    private int E_id;
    private String E_name;
    private Category E_Category;
    private Type E_Type;
    private Manager E_Manager;
    private String E_status;

    @Override
    public String toString() {
        return "Equipment{" +
                "E_id=" + E_id +
                ", E_name='" + E_name + '\'' +
                ", E_Category=" + E_Category +
                ", E_Type=" + E_Type +
                ", E_Manager=" + E_Manager +
                ", E_status='" + E_status + '\'' +
                '}';
    }

    public int getE_id() {
        return E_id;
    }

    public void setE_id(int e_id) {
        E_id = e_id;
    }

    public String getE_name() {
        return E_name;
    }

    public void setE_name(String e_name) {
        E_name = e_name;
    }

    public Category getE_Category() {
        return E_Category;
    }

    public void setE_Category(Category e_Category) {
        E_Category = e_Category;
    }

    public Type getE_Type() {
        return E_Type;
    }

    public void setE_Type(Type e_Type) {
        E_Type = e_Type;
    }

    public Manager getE_Manager() {
        return E_Manager;
    }

    public void setE_Manager(Manager e_Manager) {
        E_Manager = e_Manager;
    }

    public String getE_status() {
        return E_status;
    }

    public void setE_status(String e_status) {
        E_status = e_status;
    }
}
