package com.login;

public class Teacher extends BasePeople {
    public void Teacher(){

    }
    public void Teacher(String name, String pass){
        super.SetName(name);
        super.SetPass(pass);
    }

    @Override
    public String GetAddress() {
        return null;
    }
}
