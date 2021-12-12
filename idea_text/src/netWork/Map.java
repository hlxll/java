package netWork;

import com.login.Student;
import sun.reflect.generics.tree.Tree;

import java.util.*;

//集合体系结构
public class Map {
    /*单列集合:Collecton:  {1，2，3}=>list接口（ArrayList类等）可重复的和Set（HashSet类，TreeSet类 等）不可重复的
      双列集合：Map:  {case1: 1, case2: 2}HashMap类
    */
    public static void main(String[] args) {
        randomSet();
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
//        System.out.println(s1.get(2));
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

        //列表迭代器，ListIterator允许任一方向遍历列表的迭代器
        //上述的iterator迭代器会有并发报错，但是这个迭代器可以支持在迭代器对象中边遍历边添加数据，而不是iterator的直接在列表上添加
        ListIterator<String> li1 = s1.listIterator();
        while (li1.hasNext()) {
            String s = li1.next();
            if(s.equals("lin")){
                li1.add("asd");
            }
        }


        //增强for：简化数组和Collection集合的遍历，实现Iterable接口的类允许其对象成为增强型for语句的目标。内部原理是一个iterator迭代器
        int[] arr2 = {1,2,3,4,5};
        for (int i:arr2) {
            System.out.println(i);
        }


        //list集合子类：
            // ArrayList: 底层数据结构是数组，查询快，增删慢
            //LinkedList：底层数据结构是链表，查询慢，增删快
//        LinkedList特有功能
//        addFirst：开头插入，addLast：追加到末尾，getFirst：返回第一个
    }

    public static void Set() {
        // 不包含重复元素的集合，没有带索引的方法，不能使用普通for遍历,对集合的迭代顺序不做保证
        Set<String> st1 = new HashSet<String>();

        st1.add("hello");
        st1.add("huang");
        st1.add("hello");

//        for (String i:st1) {
//            System.out.println(i);
//        }


        //哈希值：是JDK根据数据地址，或数字，字符串算出来的int类型的数值
        Student stu = new Student();
        //同一个对象多次调用hashcode，哈希值相同，不同对象的哈希值是不同的，重写hashCode可以实现不同对象哈希值相同
//        System.out.println(stu.hashCode());

        HashSet<String> hs = new HashSet<String>();
        hs.add("huang");
        hs.add("lin");
        hs.add("huang");

//        System.out.println("HashSet");
//        for (String s: hs) {
//            System.out.println(s);
//        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("hello");
        linkedHashSet.add("word");
        linkedHashSet.add("java");
        linkedHashSet.add("java");
//        for (String s: linkedHashSet){
//            System.out.println(s);
//        }



        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(20);
//        for (int s: treeSet){
//            System.out.println(s);
//        }

        TreeSet<TreeBase> treeSet1 = new TreeSet<TreeBase>();
        TreeBase stu1 = new TreeBase("huang", 11);
        TreeBase stu2 = new TreeBase("huang", 14);
        TreeBase stu3 = new TreeBase("huang", 13);

        treeSet1.add(stu1);
        treeSet1.add(stu2);
        treeSet1.add(stu3);
//        for (TreeBase s:treeSet1){
//            System.out.println(s.getPass());
//        }

        //比较器排序
        TreeSet<TreeBase> treeSet2 = new TreeSet<TreeBase>(new Comparator<TreeBase>() {
            @Override
            public int compare(TreeBase t1, TreeBase t2) {
                int num = t1.getPass() - t2.getPass();
                return num;
            }
        });
        treeSet2.add(stu1);
        treeSet2.add(stu2);
        treeSet2.add(stu3);
//        for (TreeBase s: treeSet2) {
//            System.out.println(s.getPass());
//        }


    }


    //不相同的随机数
    public static void randomSet() {
        Set<Integer> s1 = new TreeSet<Integer>();

        Random r = new Random();
        while (s1.size()<10){
            int number = r.nextInt(20) + 1;
            s1.add(number);
        }
        for (Integer i:s1){
            System.out.println(i);
        }
    }
}
