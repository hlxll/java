package netWork;

//基本类型包装类
public class BaseClass {
//    public static final int MI
//    int包装成integer

    public static void main(String[] args) {
        //装箱，把基本类型转化成包装类型
        Integer i1 = new Integer(100);
        System.out.println(i1);
        System.out.println(Integer.valueOf(100));

        //拆箱，把包装类转换为对应的基本类型
        i1 += 200;

        typeChange();
    }

    public static void typeChange() {
        String sArr = "10 20 30 4 8";
        String[] arr = sArr.split(" ");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
