package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    @Test
    public void test(){
        // 通配符 ？ 的使用    可以读取 不能写（可以写null）

        List<?> list = null;
        List<Object> list2 = null;
        List<String> list3 = new ArrayList<>();
        list3.add("aa");

        list = list3;

        Object o = list.get(0);
        System.out.println(o.toString());


    }
}
