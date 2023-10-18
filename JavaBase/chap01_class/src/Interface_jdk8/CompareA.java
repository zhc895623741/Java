package Interface_jdk8;

public interface CompareA {
    // jdk8的 静态方法
    public static void method(){
        System.out.println("A");
    }

    // jdk8的 默认方法
    public default void method2(){
        System.out.println("A2");
    }


    public default void method3(){
        System.out.println("m3_a");
    }
}
