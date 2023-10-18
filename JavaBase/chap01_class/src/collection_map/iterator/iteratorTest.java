package collection_map.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class iteratorTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add("aa");
        coll.add("bb");
        Person p1 = new Person("wang",12);
        coll.add(p1);


        Iterator iter = coll.iterator();

        System.out.println(iter.getClass());

        System.out.println(iter.next());

        // Iterator遍历集合

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}