package inherit;

public class ManKind {
    int sex;
    int salay;

    public ManKind(int sex, int salay) {
        this.sex = sex;
        this.salay = salay;
    }

    public void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
        }
        else {
            System.out.println("woman");
        }
    }

    public void employeed(){
        if(salay==0){
            System.out.println("no job");
        }
        else if(salay>0){
            System.out.println("job");
        }
    }

//    public void setSex(int sex) {
//        this.sex = sex;
//    }
//    public void setSalay(int salay) {
//        this.salay = salay;
//    }

    public int getSex() {
        return sex;
    }
    public int getSalay() {
        return salay;
    }


}
