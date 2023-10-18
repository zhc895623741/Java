package inherit;

public class ihtest {
    public static void main(String[] args) {
        Kids k = new Kids(1,10,20);
        k.print();


        ManKind m = new Kids(0,59,20);
        int m_sex = m.getSex();
        System.out.println(m_sex);
    }
}
