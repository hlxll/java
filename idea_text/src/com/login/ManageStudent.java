package com.login;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ManageStudent {
    private String outName = "外部类";
    public static void main(String[] args) {


//        ArrayList<Student> array = new ArrayList<Student>();
//
//        addStudent(array);
//        getStudent(array);


        Student.university = "jiaoda";
        Student s1 = new Student();
        // 不推荐对象名访问静态成员，使用类名访问
        // s1.university = "jiaoda";

        Student s2 = new Student();
        System.out.println(s2.university);

        //多态：同一个对象，在不同时刻 表现不同形态，体现：继承或实现关系，方法重写，有父类引用指向子类
        //父类引用指向子类对象,a表现为子类，a成员编译和指向看左边,方法编译看左边，指向看右边，因为方法有重写
        BasePeople a = new Student();
//        System.out.println(a.age);
//        a.GetAddress();
        //
        SetPeople ao = new SetPeople();
        ao.useDuotai(a);
        //好处和弊端,提高程序扩展性，不能使用子类特有方法

        //使用匿名类实现该多态,不用创建SetPeople类
        ao.useDuotai(new BasePeople() {
            @Override
            public String GetAddress() {
                return null;
            }
        });

        //多态向下转型，解决多态弊端
        Student c = (Student)a;
        c.GetAddress();


        //接口名做参数
        BasePeople tea = new Student();
        ao.useDuotai(tea);


    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        String pass = sc.nextLine();
        Student arr = new Student();
        arr.SetName(val);
        arr.SetPass(pass);
        array.add(arr);
    }
    public static void getStudent(ArrayList<Student> array) {
        for(int i=0;i<array.size();i++){
            Student obj = array.get(i);
            System.out.println(obj.GetName()+"--"+obj.GetPassword());
        }
    }

//    成员内部类
    public class InnerStudent {
        public void show() {
            System.out.println(outName);
        }
    }
    public void showInner() {
        //内部类和外部类
        InnerStudent inner = new InnerStudent();
        inner.show();



        //局部内部类
        class BuInner {
            public void showBu(){

            }
        }

        //匿名内部类
        People i = new Student() {

            @Override
            public void GetPeopleName() {}
        };
    }

}
