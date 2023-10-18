package relection.exer;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class FruitTest {
    @Test
    public void test() throws Exception {
        //读取配置文件的信息 获取全类名
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream("src/config.properties");
        pro.load(fis);
        String fruitName = pro.getProperty("fruitName");

        //通过反射 创建指定全类名的类的实例
        Class clazz = Class.forName(fruitName);
        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);

        Fruit fruit = (Fruit) con.newInstance();

        //通过榨汁机对象调run
        Juicar juicar = new Juicar();
        juicar.run(fruit);



    }
}
