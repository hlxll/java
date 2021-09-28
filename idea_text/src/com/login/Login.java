package com.login;
//87

//快捷键
//psvm生成main方法，sout生产输出语句。Ctrl+Alt+space（内容提示，代码补全等）
//多行注释Ctrl+Shift+/
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
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }
//    public void eat(){
//        System.out.println("重写阻碍");
//    }
}
class Test {
    public static void main(String[] args) {
        Penguin d = new Penguin("hl", 12);
        d.eat();
    }
}
