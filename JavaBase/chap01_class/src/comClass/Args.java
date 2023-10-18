package comClass;

public class Args {
    public static void main(String[] args) {
        Test t = new Test();
        t.setParameters(1);
        t.setParameters(1,2,3);
        t.setParameters(new int[]{1, 2, 3});
    }
}


class Test{
    int a;
    int b;
    int c;

    //可变形参 相当于传入一个 数组  必须放在最后一个
    public void setParameters(int ... params) {
        for(int i=0; i<params.length; i++){
            System.out.println(params[i]);
        }
    }
}