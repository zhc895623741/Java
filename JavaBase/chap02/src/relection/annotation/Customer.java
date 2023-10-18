package relection.annotation;

@Table(value = "m_Customer")
public class Customer {
    @Column(columnName = "name",columnType = "varchar(25)")
    String name;
    @Column(columnName = "age",columnType = "int")
    public int age;

    static String info;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Customer() {
        System.out.println(".........");
    }

    private Customer(String name, int age) {
        this.name = name;
        this.age = age;
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
