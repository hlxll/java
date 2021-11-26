package com.login;

public abstract class BasePeople implements People {
    private String name;
    private String password;
    public int age = 10;

    public String addRess;
    //static变量就是这个类共享的变量，当其他地方new这个类之后，一次赋值，后面会共用
    public static String university;

    //给当前类定义接口，就要实现接口的规则，抽象类就可以不实现这个方法，如果是抽象类，该抽象类
    //子类也是必须实现这个方法
    public void GetPeopleName(){

    }

    //抽象类的构造方法不能实例化，用于子类访问父类的初始化
    public BasePeople(){ }
    public BasePeople(String name, String pass){
        this.name = name;
        this.password = pass;
    }

//    public String GetAddress() {
//        return addRess;
//    }
    //抽象方法,继承他的子类一定要实现这个方法
    public abstract String GetAddress();

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
