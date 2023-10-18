package relection;

import org.junit.Test;

public class NewInstanceTest {

    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        System.out.println(person);

    }
}
