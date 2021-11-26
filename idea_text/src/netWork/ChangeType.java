package netWork;

//不同数据类型转换
public class ChangeType {
    public static void main(String[] args) {
        //数字转字符串
        int number = 12;
        String s1 = ""+number;
        String s2 = String.valueOf(number);

        //字符串转数字
        String s = "100";
        Integer i = Integer.valueOf(s);
    }
}
