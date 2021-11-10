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
//继承提高了代码复用性，提高了代码的维护性
//让类与类之间产生了关系，耦合性增强，削弱了子类的独立性
//子类的构造方法默认会访问父类的无参构造方法，
public class Student extends BasePeople {
    public int age = 20;
    private String address;
    public void SetName(String name){
        //super是调用父类，
        super.SetName(name);
    }
    public String GetAddress(){
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);//父类age
        return address;
    }
    public void SetAddress(String address){
        this.address = address;
    }

}

//156


