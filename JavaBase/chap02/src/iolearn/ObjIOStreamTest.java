package iolearn;

import org.junit.Test;

import java.io.*;

public class ObjIOStreamTest {


    @Test
    public void test1() throws IOException {
        File file = new File("newtest1.txt");
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(file));

        // 写出数据 即为 序列化
        oos.writeUTF("大王大大王");

        oos.writeObject("write object");

        oos.flush();

        oos.close();
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {

        File file = new File("newtest1.txt");
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));

        String str = ois.readUTF();
        System.out.println(str);

        String str2 = (String) ois.readObject();
        System.out.println(str2);
        ois.close();
    }

    @Test
    public void test3() throws IOException, ClassNotFoundException {
        File file = new File("self.txt");

        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(file));

        Person person = new Person("wang",12);
        oos.writeObject(person);

        oos.close();

    }


    static final long serialVersionUID = 442424L;
    @Test
    public void test4() throws IOException, ClassNotFoundException {
        File file = new File("self.txt");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));


        Person p = (Person) ois.readObject();

        System.out.println(p);

        ois.close();
    }
}


class Person implements Serializable{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
