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




        Date();



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
        System.out.println(dd2);



    }

//10_calendar
}
