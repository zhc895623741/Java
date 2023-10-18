package api.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {

    @Test
    public void test(){
        Date date1 = new Date();
        System.out.println(date1.toString());

        long mm = date1.getTime();
        System.out.println(mm);
    }

    @Test
    public void test2(){
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        System.out.println(date);
    }


    //SimpleDateFormat 用于时间的格式化和解析

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sp = new SimpleDateFormat();
        Date date = new Date();
        // 格式化 日期--> 字符串
        String str = sp.format(date);
        System.out.println(str);

        //解析  字符串--> 日期
        Date date2 = sp.parse("2023/9/17 下午1:10");
        System.out.println(date2);
    }

}
