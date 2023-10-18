package StudentGradeSimple;

import java.util.Scanner;
import java.util.Vector;

public class StudentGradeTest {
    public static void main(String[] args) {
        Vector v = new Vector();


        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("请输入成绩 负数退出");
            int intScore = scan.nextInt();
            if(intScore < 0){
                break;
            }
                        //自动装箱
            v.addElement(intScore);

        }
        for(int i = 0;i<v.size();i++){
            System.out.print(v.get(i));


            System.out.println(" "+v.elementAt(i));
        }
        scan.close();
    }
}
