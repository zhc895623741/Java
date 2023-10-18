package TestMethod;

public class USBTest {
    public static void main(String[] args) {
        // 1.创建接口实现类的对象
        Computer cpt = new Computer();
        Printer p = new Printer();
//        cpt.transferData(p);

        // 2.创建接口实现类的匿名对象
//        cpt.transferData(new Camera());

        // 3.创建接口匿名实现类的匿名对象
//        cpt.transferData(new USB() {
//            @Override
//            public void start() {
//                System.out.println("mp3 start");
//            }
//
//            @Override
//            public void stop() {
//                System.out.println("mp3 stop");
//            }
//        });

        USB u = new Camera();
        u.start();
        cpt.transferData(u);

    }
}


interface USB{
    void start();
    void stop();
}

class Computer{
    public void transferData(USB usb){
        System.out.println("data start transfer");
        usb.start();
        System.out.println("data stop transfer");
        usb.stop();
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("Printer start");
    }

    @Override
    public void stop() {
        System.out.println("Printer stop");
    }
}

class Camera implements USB{
    @Override
    public void start() {
        System.out.println("Camera start");
    }

    @Override
    public void stop() {
        System.out.println("Camera stop");
    }
}