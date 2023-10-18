package Block;

public class BlockTest {
    public static void main(String[] args) {
        Person p = new Person();
//        p.eat();
    }
}

class Person{
    public Person(){}

    public void eat(){
        System.out.println("chi fan");
    }

//代码块
// 1.静态代码块 用static修饰
    static
    {
        System.out.println("静态代码块");
    }

//2.非静态代码块
    {
        System.out.println("非静态代码块");
    }
}
