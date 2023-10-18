package relection;

import org.junit.Test;


import java.lang.reflect.Constructor;

public class ReflectTest {
    public Person getInstance(){
        return new Person();
    }
    public <T> T getInstance(String className) throws Exception{
        Class clazz = Class.forName(className);
        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);
        return (T) con.newInstance();
    }

    @Test
    public void test() throws Exception {
        Person p = getInstance();

        String className ="relection.Person";
        Person p2 = getInstance(className);


    }
}
