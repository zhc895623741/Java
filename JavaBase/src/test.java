import java.util.Scanner;

class test {
    public static void main(String[] args){
//        System.out.println("heelo");

//        //float类型 需要最后加 f 或 F
//        float a= 1.4f;
//
//        //boolean类型 占 4个字节
//        boolean bool = true;
//        int a = 10;
//        String str = "12";
//        System.out.println(str + bool);

//        Scanner scan = new Scanner(System.in);
//        String name = scan.next();
//        System.out.println(name);
//
//        int age = scan.nextInt();
//
//        scan.close();


          //数组创建
//        int[] arr = new int[4];
//        for(int i = 0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//          int[] arr ={1,3,5,6};
//
//          int[] array;
//          array = new int[]{1,23,4};



        int[][] arr = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[]{1,2,4,5};
        for(int i=0; i <arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.println(arr[i][j]);
        }




    }
}
