package com.login;

class BasePeople {
    private String name;
    private String password;
    public int age = 10;
    public BasePeople(){ }
    public BasePeople(String name, String pass){
        this.name = name;
        this.password = pass;
    }

    public String GetName(){
        return name;
    }
    public String GetPassword(){
        return password;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void SetPass(String pass){
        this.password = pass;
    }
}
