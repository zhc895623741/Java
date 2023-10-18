package collection_map.map;

import org.junit.Test;

import java.util.*;

public class TreeMapTest {

    @Test
    public void test(){
        TreeMap map = new TreeMap();
        map.put("a",12);
        map.put("b",54);
        map.put("d",21);
        map.put("c",23);

//        Iterator iter = map.keySet().iterator();
//        while(iter.hasNext()){
//            Object next = iter.next();
//            System.out.println(next);
//        }

//        Set entrySet = map.entrySet();
//        for(Object entry : entrySet){
//            System.out.println(entry);
//        }


        Collection entryset = map.entrySet();
        for(Object entry : entryset){
            System.out.println(entry);
        }

        Collection keyset = map.keySet();
        for (Object o : map.keySet()) {
            System.out.println(o.toString());
        }

        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value.toString());
        }


    }
}
