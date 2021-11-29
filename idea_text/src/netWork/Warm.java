package netWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Warm {
    public static void main(String[] args) {
        try{
            throwWarm();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }


    //异常处理
    //getMessage()返回次throwable的详细信息字符串
    //toString()返回此可抛出的简短描述
    //pritStackTrace把异类的错误信息输出在控制台
    public static void Warm() {
        int[] arr = {1,2,3,4};
//        System.out.println(arr[4]);
        //如果程序出现问题，我们没有做处理，jvm默认处理方案会中断程序
//        try - catch和
        try {
            System.out.println(arr[4]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("你访问的数组索引不存在");
            //e的成员方法
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
    //编译时异常和运行时异常,所有RuntimeException类及其子类被称为运行时异常，其他都是编译时异常
    //编译异常必须显示处理
    public static void Exception() {
        //这里的d2格式和parse使用的时候需要一致，有可能报错，编译不通过，所以需要使用try-catch
        try {
            String d2 = "2021-09-09 22:22:22";
            SimpleDateFormat date3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //d2的格式和SimpleDateFormat的参数格式需要一样
            Date dd2 = date3.parse(d2);
        } catch(ParseException e) {
            e.printStackTrace();
        }
    }
    //有些异常使用throws，因为try有时候是没有权限的,throws是抛出错误没有处理，让错误可以使用try处理
    public static void throwWarm() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
    //自定义异常
    //在可能报错地方使用throw new ScoreException("")抛出异常，参数是异常内容
    //throw和throws区别，前者肯定抛出异常，后者不一样抛出异常

}
