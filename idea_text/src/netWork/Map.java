package netWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//集合体系结构
public class Map {
    /*单列集合:Collecton:  {1，2，3}=>list接口（ArrayList类等）可重复的和Set（HashSet类，TreeSet类 等）不可重复的
      双列集合：Map:  {case1: 1, case2: 2}HashMap类
    */
    public static void main(String[] args) {
        List();
    }
    public static void SetCollection() {
//        Collection集合是单列集合的顶层接口，不提供此接口的任何直接实现，提供更具体的set和List
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("word");
        c.add("word");
        c.remove("word");

        //iterator返回此集合中元素的迭代器：next方法，返回迭代下一个元素，hasNext如果迭代有下一个元素返回true
        Iterator<String> it = c.iterator();
        //先判断有没有下一个，再输出下一个
        while(it.hasNext()){
            String s = it.next();
        }
    }
    public static void List() {
        //有序集合，用户可以精确控制列表中每个元素的插入位置，可以通过索引访问元素，允许重复元素
        List<String> s1 = new ArrayList<String>();

        s1.add("hello");
        s1.add("word");
        s1.add("huang");
        s1.add("word");

        s1.add(2, "dierge");
        s1.set(1, "lin");
        System.out.println(s1.get(2));
        //迭代器遍历
        Iterator<String> it = s1.iterator();

        /*并发修改异常
        * 迭代器遍历中，修改数据，照成预期修改数量和实际修改数量不一样，报错,用for循环解决
        * */

//        while(it.hasNext()) {
//            if(it.next() == "hello") {
//                s1.add("xulinlin");
//            }
//        }
        for(int i=0;i<s1.size();i++) {
            if(s1.get(i) == "hello") {
                s1.add("xulinlin");
            }
        }
        System.out.println(s1);
    }

    //230列表迭代器

}
