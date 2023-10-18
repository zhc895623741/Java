package Thread_f.createmore;


import java.util.concurrent.Callable;

// jdk5 新增的两种方式
public class callableTest {
    public static void main(String[] args) {
        NumThread nt = new NumThread();
        
    }

}


class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <=100; i++) {
            if(i %2 == 0) {
                sum += 1;
            }
        }
        return sum;
    }
}