package TestMethod;

public class test02 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = t1;
        System.out.println(t1==t2);
        t1 = new Test();
        System.out.println(t1==t2);
    }
}

class Test{

}
