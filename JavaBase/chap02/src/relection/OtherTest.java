package relection;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OtherTest {
    //1.获取运行时类的父类
    @Test
    public void test() throws ClassNotFoundException {
        Class clazz = Class.forName("relection.Person");
        Class superClass = clazz.getSuperclass();
        System.out.println(superClass);
    }

    //2.获取运行时类实现的接口
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("relection.Person");
        Class[] interfaces = clazz.getInterfaces();
        for(Class c : interfaces){
            System.out.println(c);
        }

    }

    //3.获取运行时类所在的包
    @Test
    public void test3() throws ClassNotFoundException {
        Class clazz = Class.forName("relection.Person");
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }

    //4.获取运行时类的带泛型的父类
    @Test
    public void test4() throws ClassNotFoundException {
        Class clazz = Class.forName("relection.Person");
        Type superClass = clazz.getGenericSuperclass();
        System.out.println(superClass);
    }

    //5.获取运行时类的父类的泛型
    @Test
    public void test5() throws ClassNotFoundException {
        Class clazz = Class.forName("relection.Person");
        Type superClass = clazz.getGenericSuperclass();
        //如果父类带泛型 可以强转为ParameterizedType
        ParameterizedType paramType = (ParameterizedType) superClass;
        Type[] arguments= paramType.getActualTypeArguments();
        for(Type arg: arguments){
            System.out.println(((Class)arg).getName());
        }
    }
}
