package com.login;
//103，104，105内存图未学
//快捷键
//psvm生成main方法，sout生产输出语句。Ctrl+Alt+space（内容提示，代码补全等）
//多行注释Ctrl+Shift+/
//ctrl+alt+V 可以快速补充new一个方法的返回值

import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//类和对象的关系：类是对象的抽象，对象是类的实体
public class Login {
    public static  void  main(String[] args) {
        int[] arr = new int[3];
        int[] arrS = {1,2,3};//静态命名

        System.out.println(arr.length);
        System.out.println(arrS[0]);
        for(int x=0; x<3; x++){
            System.out.println(arrS[x]);
        }
        login(2);
        register(1, 2);
        register((byte) 10, (byte) 20);
        int[] arrList = {1,2,3,4,5};
        arrJoin(arrList);
    }
    public static void login(int age){
        System.out.println("方法定义");
        System.out.println(age);
    }
    public static boolean register(int a, int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean register(byte a, byte b){
        System.out.println("byte");
        return a == b;
    }

    public static void arrJoin(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //方法重载，在同一个类中，且方法名相同的，参数不同和返回值不同都是重载
}
class Animal {
    private String name;
    private int id;
    public int num;
    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    public final void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是"+id+"号"+name+".");
    }
}
class Penguin extends Animal {
    //继承之后定义方法，使用super获取基类，类内部定义和类名一样的方法，用来实例化类时候传递参数，继承时定义的这个方法和基类一样格式
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }
//    public void eat(){
//        System.out.println("重写阻碍");
//    }
}
//类内部，方法外的是成员变量，堆内存中，随着对象存在而存在
//方法中的是局部变量，栈内存中，随着方法存在而存在，调用完毕消失而消失
class Test {
    public String name;
    public Test() {
        //构造方法书写内容
        //当没有定义构造方法，系统会给一个默认的无参构造方法，无论是否使用，都手工写一个无参构造方法
        System.out.println("无参构造方法");
    }
    public Test(String name) {
        this.name = name;
    }
    public Test(int num) {
        System.out.println(num);
    }
    String Name;
    //封装，定义的私有属性，只有类内部可以访问，定义类内部方法，操作这个私有属性，就是封装方法
    private int age;
    public void setAge(int age) {
        //this指代成员变量，this在哪个类就指导哪个类，方法被哪个对象调用，方法里面的this就代表那个对象
        this.age = age;
    }
    //构造方法：
    public static void main(String[] args) {
        //创建对象,new一个构造方法
        Penguin d = new Penguin("hl", 12);
        d.eat();
    }
}

//标准类制作
class SetStudent {
    //成员变量，使用private修饰，构造方法，提供一个无参构造方法，提供一个带多个参数的构造方法
    private String Name;
    public SetStudent() {};
    public SetStudent(String name){
        System.out.println(name);
    }
    public static void UseApi(){
        Object data = new Random();
        System.out.println(data);
        //创建字符串
        String s1 = new String();
        char[] chs = {'a', 'b'};
        String s2 = new String(chs);
        byte[] bys = {98, 99};
        String s3 = new String(bys);
        String s4 = "asd";
        //推荐最后一种
        //new创建的，每一次new都会申请一个内存空间虽然内容相同，但是地址值不同
        //最后一种，只要字符串相同，不管出现几次，都是相同的地址内容
        //==是比较地址，equals是比较内容，s1.equals(s2)
    }

    public static String joinArr(int[] arr) {
        String s = "";
        for(int i=0;i<arr.length;i++){
            s +=arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        UseApi();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据");
        String line = sc.nextLine();
        //控制台生成一个输入数据功能
        System.out.println("你输入的数据是"+line);

        String username = "huanglin";
        int[] password = {1,2,3,4};

        Scanner us = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = us.nextLine();
        for(int i=0;i<3;i++){
            System.out.println(line.charAt(i));
        }
        String res = joinArr( password );
        System.out.println(res);
        System.out.println(line.length());

        //stringbuilder是可变的字符串，和string区别
        //string内容是不可变的，拼接时候会产生新内存，但是stringbuilder拼接时候不会产生新内存
        //stringbuilder有append，添加数据和reverse反转顺序
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("hello");
        System.out.println("sb:"+sb2);
//        stringbuilder和string转换
        String s = sb.toString();
        StringBuilder sb3 = new StringBuilder(s);
        int[] arr = {1,2,3,4};
        for(int i=0;i<arr.length;i++){
            sb3.append(arr[i]);
        }
        sb3.toString();
        System.out.println(sb3);
        setName("huang");
    }

    public static void setName(String name) {
        //集合，树的内容改变时候，内存长度不会改变
        //集合内容改变，长度会改变,可调整大小的数组实现
        //创建空对象
        ArrayList<String> arrS1 = new ArrayList<String>();
        //add给arraylist添加数据
        arrS1.add("huang");
        arrS1.add(1, "lin");
        System.out.println(arrS1);



        //集合遍历,通过get(int index)获取，长度用size()实现
        ArrayList<String> array = new ArrayList<String>();
        array.add("huang");
        array.add("lin");
        array.add("1");
        System.out.println(array);
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }

    }
    //141
}