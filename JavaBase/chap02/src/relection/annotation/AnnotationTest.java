package relection.annotation;

import org.junit.Test;

import java.lang.reflect.Field;

public class AnnotationTest {
    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        Class clazz = Customer.class;

        Table annotation = (Table) clazz.getDeclaredAnnotation(Table.class);
        System.out.println(annotation.value());
    }

    @Test
    public void test2() throws NoSuchFieldException {
        Class clazz = Customer.class;
        Field nameField = clazz.getDeclaredField("name");
        Column nameColumn = nameField.getDeclaredAnnotation(Column.class);
        System.out.println(nameColumn.columnName());
        System.out.println(nameColumn.columnType());
    }
}
