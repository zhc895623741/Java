package relection;

public class Person extends Base<String>{
    String name;
    public int age;

    static String info;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
        System.out.println(".........");
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("private constructor");
    }

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


    public void show(){
        System.out.println("I'm a person");
    }

    private void privateShow(String str,int num){
        System.out.println(str + num);
    }
}
