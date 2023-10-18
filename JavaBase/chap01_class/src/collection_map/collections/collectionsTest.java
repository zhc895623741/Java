package collection_map.collections;

import org.junit.Test;

import java.util.*;

public class collectionsTest {

    @Test
    public void test(){
        List list = Arrays.asList(12,232,12314,22);
        Comparable max = Collections.max(list);

        // 默认升序
        System.out.println(max);   //12314

        Object max1 = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return -(i1.intValue() - i2.intValue());
                }
                throw new RuntimeException("Class is not match");
            }
        });

        System.out.println(max1);    //12

    }

    @Test
    public void test2(){
        List src = Arrays.asList(12,232,2424,11,23,45);

        List dest = Arrays.asList(new Object[src.size()]);

        Collections.copy(dest,src);
        System.out.println(dest);
    }

    @Test
    public void test3(){
        List list = new ArrayList<>();

        // list1是线程安全的
        List list1 = Collections.synchronizedList(list);

        HashMap map = new HashMap();
        Map map1 = Collections.synchronizedMap(map);




    }
}

