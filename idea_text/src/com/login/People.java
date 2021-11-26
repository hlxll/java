package com.login;

//接口中变量默认被final修饰，默认被静态修饰，可以直接类名获取变量
//接口没有构造方法，主要是对行为进行

//类和接口：可以单实现，也可以多实现
//接口和接口:继承关系，可以单继承也可以多继承
public interface People {
    public abstract void GetPeopleName();
}
