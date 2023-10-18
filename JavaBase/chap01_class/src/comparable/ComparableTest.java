package comparable;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {

    @Test
    public void test(){
        Product[] arr = new Product[5];
        arr[0] = new Product("aa");
        arr[1] = new Product("bb");
        arr[2] = new Product("cc");
        arr[3] = new Product("dd");
        arr[4] = new Product("ff");

//        Arrays.sort(arr);
//
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        Comparator comparator = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;
                    return p2.getName().compareTo(p1.getName());
                }

                throw new RuntimeException("类型不匹配");
            }
        };
        Arrays.sort(arr,comparator);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

class Product implements Comparable{
    private String name;
    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        if(o == this){
            return 0;
        }

        if(o instanceof Product){
            Product p = (Product)o;

            return this.name.compareTo(p.name);
        }

        throw new RuntimeException("类型不匹配");
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}


