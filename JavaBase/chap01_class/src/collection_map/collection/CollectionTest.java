package collection_map.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {

    @Test
    public void test(){
        ArrayList array = new ArrayList();
        array.add("aa");
        array.add("bb");
        array.add(123);

        System.out.println(array);
        System.out.println(array.size());

        ArrayList arr2 = new ArrayList();

//        arr2.add(array);
//        System.out.println(arr2);   //[[aa, bb, 123]]

        arr2.addAll(array);
        System.out.println(arr2);   //[aa, bb, 123]



        Collection col = new ArrayList();
        col.add(array);
        System.out.println(col);



        // 集合 --> 数组
        Object[] obj = col.toArray();
        System.out.println(Arrays.toString(obj));


    }

    @Test
    public void test2(){
        //数组 --> 集合

        String[] arr = new String[]{"aa","bb","cc"};
        Collection list = Arrays.asList(arr);
        System.out.println(list);


        Integer[] a1 = new Integer[]{1,2,3};
        Collection l1 = Arrays.asList(a1);
        System.out.println(l1);

        int[] a2 = new int[]{2,2,2};
        l1 = Arrays.asList(a2);
        System.out.println(l1);

        l1 = Arrays.asList(1,2,3);
        System.out.println(l1);
    }
}
