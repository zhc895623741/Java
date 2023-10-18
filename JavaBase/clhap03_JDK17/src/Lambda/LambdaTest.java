package Lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest {
    // 语法格式一  无参 无返回值
    @Test
    public void test1(){
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("run run run");
            }
        };
        r1.run();

        //lambda
        Runnable r2 = ()-> System.out.println("run run");
        r2.run();
    }


    // 语法格式二  需要一个参数 无返回值
    @Test
    public void test2(){
        Consumer<String> c1 = new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        //lambda
        Consumer<String> c2 = (String s)-> {
            System.out.println(s);
        };
        c2.accept("zhangsan");
    }

    // 语法格式三 数据类型可以省略 类型推断
    @Test
    public void test3(){
        Consumer<String> c2 = (s)-> {
            System.out.println(s);
        };
        c2.accept("you mo");
    }

    // 语法格式四  只有一个参数时 （）可以省略
    @Test
    public void test4(){
        Consumer<String> c2 = s-> {
            System.out.println(s);
        };
        c2.accept("you qu");
    }

    // 语法格式五  有两个或以上的参数 多条执行语句 有返回值
    @Test
    public void test5() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("hh");
                System.out.println("xixi");
                return o1.compareTo(o2);
            }
        };

        //lambda
        Comparator<Integer> ccom = (o1, o2) -> {
            System.out.println("hh");
            System.out.println("xixi");
            return o1.compareTo(o2);
        };
        System.out.println(ccom.compare(23, 12));

    }

    // 语法格式六 当只有一条语句 return 和 {} 都可以省略
    @Test
    public void test6(){
        Comparator<Integer> com = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com.compare(12,23));

    }
}
