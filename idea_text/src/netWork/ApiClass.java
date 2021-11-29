package netWork;

import com.login.Student;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class ApiClass {

    public static void main(String[] args) throws ParseException {

        System.out.println(Math.abs(12));
        System.out.println(Math.abs(-12));
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.floor(12.34));

        //object类是类层次结构的根
        Student s = new Student();
        System.out.println(s.toString());
        //重写toString使用alt+ins
        Student s2 = new Student();
        System.out.println(s.equals(s2));//比较是否相等，equals在Student类中重写


        //system类
        //返回当前时间与1970年的毫秒值
        System.out.println(System.currentTimeMillis());


        //ArrayList是抽象类
        ArrayList<Integer> arr1 = new ArrayList();
        //Array类是工具类，构造方法私有，成员方法公有静态
        int[] arr = {5, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("终止Java虚拟机");
        //终止当前运行的java虚拟机，非0表示异常终止
        System.exit(0);
        System.out.println("已经终止");



    }

    public static void Date() throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);

        //getTime获取默认的1970年到当前的毫秒值，setTime是设置起始值，设置起始值到d1的毫秒值是2222222
        System.out.println(d1.getTime());
//        d1.setTime(2222222);
//        System.out.println(d1.getTime());

        SimpleDateFormat date1 = new SimpleDateFormat();
        System.out.println(date1.format(d1));

        SimpleDateFormat date2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(date2.format(d1));

        String d2 = "2021-09-09 22:22:22";
        SimpleDateFormat date3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //d2的格式和SimpleDateFormat的参数格式需要一样
        Date dd2 = date3.parse(d2);


        //calender可以在某时间提供与日历字段转换,calender是抽象类，不能直接实例化
        Calendar c = Calendar.getInstance();//多态的形式
        int year = c.get(Calendar.YEAR);
        //calendar的三个常用方法:get返回给定日历字段的值，

        c.add(Calendar.YEAR, -3);
        int year1 = c.get(Calendar.YEAR);
        System.out.println(year1);
        // add:对日历字段进行添加时间

        c.set(2048, 11, 11);
        //set对当前时间进行修改

    }


}
