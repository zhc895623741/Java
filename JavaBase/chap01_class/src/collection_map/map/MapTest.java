package collection_map.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    @Test
    public void test(){
        // HashMap健壮性好

        Map map = new HashMap();

        map.put(null,123);
        map.put("aa",555);
        map.put(12,534);
        System.out.println(map);

        map.remove("aa");

    }
}
