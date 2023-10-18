package TestMethod;

public class test01 {
    public static void main(String[] args) {

        base b1 = new son();

        System.out.println(b1);

        base b2 = b1;
        System.out.println(b1.equals(b2));

        // 类.静态变量  可以直接调用
        base.index = 3;
        System.out.println(base.index);


        son s = (son)b1;
        System.out.println(s == b1);


        new test01().way();

        test01.way2();

        

    }
    public void way(){
        System.out.println("aaa");
    }
    static void way2(){
        System.out.println("bbb");
    }
}

class base{
    int a;
    static int index;
    public void setA(int a) {
        this.a = a;
    }

    public int getA(){
        return a;
    }
}

class son extends base{

}
