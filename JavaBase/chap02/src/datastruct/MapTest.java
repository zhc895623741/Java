package datastruct;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTest {
    @Test
    public void test(){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(31, "zzz");
        map.put(31, "hhh");
        map.put(47, "wang wu");
        map.put(45, "zhao liu");

        System.out.println(map.toString());


        LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(31, "zzz");
        map2.put(31, "hhh");
        map2.put(47, "wang wu");
        map2.put(45, "zhao liu");

        System.out.println(map2.toString());

    }
}
