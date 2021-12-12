package com.login;

//import引入其他包的类，可以直接使用
import com.main.index;

import java.io.Serializable;
import java.util.Objects;

//final定义的类，是最终类，不能被继承,变量定义final不能被修改,方法被final修饰，不能重写
//final修饰引用类型，引用类型的地址值不能变，但是内容可以变

//静态成员方法，只能访问静态的变量和方法


// 继承提高了代码复用性，提高了代码的维护性
// 让类与类之间产生了关系，耦合性增强，削弱了子类的独立性
// 子类的构造方法默认会访问父类的无参构造方法，
// 只能继承一个类，支持多层继承
public class Student extends BasePeople implements Serializable {
    private static final long serialVersionUID = 42L;
    public transient int age = 20;
    private String address;
    public Student() { };
    public Student(String name, String pass) {
        super.SetName(name);
        super.SetPass(pass);
    }

    public void SetName(String name, String pass){
        //super是调用父类，super是子类保存父类的空间
        super.SetName(name);
        super.SetPass(pass);
    }

    //重写父类方法，加一个注解，会检查重写方法的声明正确性，快捷键，写@Override
    //父类私有方法，子类不能重写，重写方法的权限必须大于等于父类
    @Override
    public String GetName() {
        return super.GetName();
    }

    @Override
    public boolean equals(Object o) {
//        this -- s
//        o ---- s2
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        Student student = (Student) o;//student等于s2
        return age == student.age &&
                Objects.equals(address, student.address);
    }

    @Override
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

    public static void main(String[] args) {

    }

}





