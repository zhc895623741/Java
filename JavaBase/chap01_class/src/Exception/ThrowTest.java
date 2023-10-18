package Exception;

public class ThrowTest {
    public static void main(String[] args) {
        Student s = new Student();
//        try{
//            s.regist(10);
//            s.regist(-10);
//            System.out.println(s);
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }
        try{
            s.regist(10);
            s.regist(-10);
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Student{
    private int id;

    public void regist(int id) throws Exception {
        if(id >= 0){
            this.id = id;
        }
//        else{
//            //运行时异常
//            throw new RuntimeException("输入非法");
//        }
        else{
            throw new Exception("Invalid");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
