package collection_map.set.TreeSet;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void test(){
        //自然排序

        TreeSet set = new TreeSet();

        set.add("aa");
        set.add("cc");
        set.add("bb");


        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }


    @Test
    public void test2(){

        User u1 = new User("a",1);
        User u2 = new User("c",5);
        User u3 = new User("b",1);

        TreeSet set = new TreeSet();
        set.add(u1);
        set.add(u2);
        set.add(u3);

        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

    @Test
    public void test3(){
        //定制排序
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    if (u1.age != u2.age) {
                        return u1.age - u2.age;
                    } else {
//                        return u1.name.compareTo(u2.name);
                        return u1.getName().compareTo(u2.getName());
                    }
                }
                throw new RuntimeException("类型不匹配");
            }
        });

        User u1 = new User("a",1);
        User u2 = new User("c",5);
        User u3 = new User("b",1);


        set.add(u1);
        set.add(u2);
        set.add(u3);

        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

class User implements Comparable{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o) return 0;
        if(o instanceof User){
            User u = (User) o;
            if(this.age != u.age){
                return this.age - u.age;
            }
            else{
                return this.name.compareTo(u.name);
            }
        }
        throw new RuntimeException("类型不匹配");
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
