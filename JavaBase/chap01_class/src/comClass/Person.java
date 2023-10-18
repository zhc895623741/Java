package comClass;

public class Person {
    int age;

    public Person() {

    }

    public Person(int age) {
        // this调用构造器  this(形参列表)   且必须放在首行
        this();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
