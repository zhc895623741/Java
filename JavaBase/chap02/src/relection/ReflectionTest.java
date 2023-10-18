package relection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    @Test
    public void test(){
        Person p1 = new Person();
        p1.age = 10;
        System.out.println(p1.age);
        p1.show();

    }

    //使用反射
    @Test
    public void test2() throws Exception {
        //创建实例
        Class<Person> cla = Person.class;
        Person p1 = cla.newInstance();
        System.out.println(p1);

        //调用属性
        //public int age
        Field ageField = cla.getField("age");
        ageField.set(p1,10);
        System.out.println(ageField.get(p1));

        //调方法
        //public void show
        Method show = cla.getMethod("show");
        show.invoke(p1);

    }

    @Test
    public void test3() throws Exception {
        //创建Person实例
        Class clazz = Person.class;
        Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);
        Person p1 = (Person)cons.newInstance("tom",12);
        System.out.println(p1);


        //调私有属性
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1,"cherry");
        System.out.println(nameField.get(p1));
    }


    //获得指定属性
    @Test
    public void test4() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        //class实例
        Class clazz = Person.class;
        Person p = (Person)clazz.newInstance();
        //通过Class实例调getDeclaredField 返回Field类
        Field name = clazz.getDeclaredField("name");
        //setAccessible(true) 保证此属性可访问
        name.setAccessible(true);
//        System.out.println(name.get(p));

        //
        name.set(p,"zhangsan");
        System.out.println(name.get(p));
    }
    @Test
    public void test5() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;
        Person p1 = (Person) clazz.newInstance();
        Field infoField = clazz.getDeclaredField("info");
        infoField.setAccessible(true);

        //set静态属性的两种方法
//        infoField.set(p1,"123456");
        infoField.set(null, "123456");
        System.out.println(infoField.get(p1));
    }


    //获取指定方法
    @Test
    public void test6() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Person.class;
        Person p = (Person) clazz.newInstance();
        Method showMethod = clazz.getDeclaredMethod("privateShow", String.class, int.class);
        showMethod.setAccessible(true);
        Object obj = showMethod.invoke(p,"zhc",123);
        System.out.println(obj);
    }

    //获取指定构造器
    @Test
    public void test7() throws Exception{
        Class clazz = Person.class;
        Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance("zhangsan",123);
        System.out.println(instance);
    }
}
