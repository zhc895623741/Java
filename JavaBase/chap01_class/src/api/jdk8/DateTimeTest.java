package api.jdk8;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {

    @Test
    public void test(){
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);

        LocalDate ld2 = LocalDate.of(2023,12,5);
        LocalDateTime ldt2 = LocalDateTime.of(2023,12,5,11,23,42);

        System.out.println(ld2);
        System.out.println(ldt2);



    }
    @Test
    public void test2(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        LocalDateTime ldt = LocalDateTime.now();
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);
    }
}