package relection;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class ClassLoadTest {
    @Test
    public void test() throws IOException {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream(new File("info.properties"));
        pros.load(fis);
        String name = pros.getProperty("name");
        String value = pros.getProperty("age");
        System.out.println(name + " " + value);
    }

    @Test
    public void test2() throws IOException {
        //ClassLoad
        Properties pros = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info1.properties");
        pros.load(is);
        String name = pros.getProperty("name");
        String value = pros.getProperty("age");
        System.out.println(name + " " + value);
    }
}
