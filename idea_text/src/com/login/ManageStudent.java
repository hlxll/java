package com.login;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        addStudent(array);
        getStudent(array);
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
}
