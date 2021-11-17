package com.login;

class BasePeople {
    private String name;
    private String password;
    public int age = 10;

    public String addRess;
    //static变量就是这个类共享的变量，当其他地方new这个类之后，一次赋值，后面会共用
    public static String university;
    public BasePeople(){ }
    public BasePeople(String name, String pass){
        this.name = name;
        this.password = pass;
    }

    public String GetAddress() {
        return addRess;
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
