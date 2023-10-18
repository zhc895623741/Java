package inherit;

public class Kids extends ManKind{
    private int age;
    public Kids(int sex, int salay, int age) {
        super(sex, salay);
        this.age = age;
    }

    public void print(){
        System.out.println(age);
        System.out.println(this.getSex());
    }


}
