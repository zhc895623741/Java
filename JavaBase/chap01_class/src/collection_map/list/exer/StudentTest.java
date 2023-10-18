package collection_map.list.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StudentTest {
    @Test
    public void test(){
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while(scanner.nextInt() != 0){
            System.out.println("请输出姓名：");
            String name = scanner.next();
            System.out.println("请输入年龄：");
            int age = scanner.nextInt();
            Student s = new Student(name, age);
            list.add(s);
        }

        for(Object obj: list){
            System.out.println(obj.toString());
        }
    }
}


class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}