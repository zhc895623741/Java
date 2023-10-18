package collection_map.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class forTest {

    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add("aa");
        coll.add("bb");
        Person p1 = new Person("wang",12);
        coll.add(p1);


        //增强for 底层使用的时Iterator迭代器
        for(Object o: coll){
            System.out.println(o);
        }


        int[] a = new int[]{1,2,3};

        for(int i : a){
            System.out.println(i);
        }

    }
}
