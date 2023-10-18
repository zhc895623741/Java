public class class01 {
    public static void main(String[] args) {
        func f =  new func();
        f.way(10);
    }


}

class func {
    public void way(int n) {
        if(n == 0){
            return;
        }
        else {
            System.out.println("1");
            way(n-1);
        }
    }
}

