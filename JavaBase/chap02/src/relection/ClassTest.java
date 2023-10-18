package relection;

import org.junit.Test;

public class ClassTest {

    @Test
    public void test() throws ClassNotFoundException {
        //1.调用运行时类的静态属性 class
        Class clazz1 = Person.class;
//        System.out.println(clazz1);

        //2.调用运行时类的对象的getclass()

        Class clazz2 = new Person().getClass();
//        System.out.println(clazz2);

        //3.调用Class的静态方法forName
        String className = "relection.Person";       //全类名
        Class clazz3= Class.forName(className);


        //4.使用类的加载器
        Class<?> clazz4 = ClassLoader.getSystemClassLoader().loadClass("relection.Person");


        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz1 == clazz4);
    }
}
