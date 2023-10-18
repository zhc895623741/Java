package TestMethod;

public class interfaceTest {
    public static void main(String[] args) {
//        System.out.println(flyable.MAX_SPEED);

//        flyable.MIN_SPEED = 122;    //报错 final不可更改

        bullet f = new bullet();
        f.fly();
        f.attack();


    }
}

interface flyable{
    public static final int MIN_SPEED = 0;

    int MAX_SPEED = 100;        //属性可以省略 public static

    void fly();    //方法可以省略 public abstract

}

interface attackable{
    void attack(); //
}


class bullet implements flyable,attackable{

    @Override
    public void fly() {
        System.out.println("i can fly!");
    }

    @Override
    public void attack() {
        System.out.println("pong!");

    }






}