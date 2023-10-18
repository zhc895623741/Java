package generic;

import org.junit.Test;

import java.util.*;

public class CollectionMapTest {

    //泛型在List的应用
    @Test
    public void test() {

        List<Integer> list = Arrays.asList(12, 42, 21);


        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

    //泛型在Map的应用
    @Test
    public void test2() {
        Map<String, Integer> map = new HashMap<>();

        map.put("aa", 123);
        map.put("vv", 232);
        map.put("cc", 111);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry);
        }


        //jdk10
        var en = map.entrySet();
        var iter = en.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
