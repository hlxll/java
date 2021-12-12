package netWork.method;

import com.login.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//键重复，后面的会覆盖前面的
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("item1", "huangln");
        map.put("item2", "huangln1");
        map.put("item3", "huangln2");



        //将类对象作为Map的键，需要重写这个类的equals和hashCode方法，否则Map的键就没有唯一性
        Map<MapStudent, String> map2 = new HashMap<MapStudent, String>();
        MapStudent s1 = new MapStudent("huang");
        MapStudent s2 = new MapStudent("huang");
        map2.put(s1, "杭州");
        map2.put(s2, "北京");

        Set<MapStudent> keyList = map2.keySet();
        for (MapStudent s: keyList){
            System.out.println(map2.get(s));
        }
    }
}
