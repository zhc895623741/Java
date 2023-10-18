package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderTest {
    @Test
    public void test(){
        Order<String> order = new Order();
        String t = order.getT();

        SubOrder1 order1 = new SubOrder1();
        Integer t2 = order1.getT();


        Order<Integer> order2 = new SubOrder1();

        SubOrder2<Integer> order3 = new SubOrder2();

        Integer t1 = order3.getT();

        SubOrder2<String> o2 = new SubOrder2();

        Integer[] arr = new Integer[]{1,2,3};
        ArrayList list = o2.myAddElements(arr);
        System.out.println(list);


    }
}


class SubOrder1 extends Order<Integer> {


}

class SubOrder2<T> extends Order<T>{


    public <E> ArrayList<E> myAddElements(E[] array) {

        ArrayList<E> list = new ArrayList();
        for(E e : array){
            list.add(e);
        }

        return list;

    }



    @Override
    public String toString() {
        return "SubOrder2{" +
                "t=" + t +
                '}';
    }
}


class mTest{

    public<T> String get(Integer i,T t){
        return null;
    }
}

