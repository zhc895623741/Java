package generic.exer;

import org.junit.Test;

import java.util.HashMap;

public class DaoTest {
    @Test
    public void test(){
        Dao<Integer> dao = new Dao();
        dao.save("aa",2);
        System.out.println(dao.toString());
    }
}
