package collection_map.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class listTest {

    @Test
    public void test(){
        List list = new ArrayList();

        list.add("aa");
        list.add(123);
        list.add("bb");
        Person p1 = new Person("John", 12);
        list.add(p1);
        list.add(2);


//        list.remove(2);
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(2));
//        System.out.println(list);

//        System.out.println(list);


        List list1 = Arrays.asList(1,2,3);
        List l2 = new ArrayList(list1);
//        l2.addAll(list1);

        l2.remove(2);
//        System.out.println(l2);

//        System.out.println(list1);
//
//        System.out.println(list1.get(2));





        Iterator iter = list1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

//        for(Object o :list1){
//            System.out.println(o);
//        }

//        for(int i = 0; i < list1.size(); i++){
//            System.out.println(list1.get(i));
//        }
    }
}
