//泛型

package netWork.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


//ManyType<String> s = new ManyType<String> ();
public class ManyType<T> implements generic<T> {
    private T name;
    public T getName(){
        return this.name;
    }
    public void show(T t){

    }

    //泛型方法,实例化这个类之后，在调用方法的时候可以传入任意类型的参数
    public <T> void get(T t) {
        System.out.println(t);
    }
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
//        c.add(100);
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<?> c1 = new ArrayList<Number>();
        List<? extends Number> c2 = new ArrayList<Integer>();
        List<? extends Number> c3 = new ArrayList<Number>();
        List<? super Number> c4 = new ArrayList<Number>();
//        List<? super Number> c5 = new ArrayList<Integer>();
    }
}


