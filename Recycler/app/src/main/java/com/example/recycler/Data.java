package com.example.recycler;

public class Data {
    private int avatar;
    private String name;
    private String dateB;
    private String email;

    public Data (int icon, String text, String dateB,String email){
        this.avatar = avatar;
        this.name = name;
        this.dateB = dateB;
        this.email = email;
    }
    public int getAvatar(){
        return avatar;
    }

    public void setAvatar(int avatar){
        this.avatar = avatar;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDateB(){
        return dateB;
    }

    public void setDateB(String dateB){
        this.dateB = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }



}
