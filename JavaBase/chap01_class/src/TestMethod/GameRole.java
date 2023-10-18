package TestMethod;


class NoLifeValueException extends Exception{
    static final long serialVersionUID = 1L;
    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }

    public NoLifeValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLifeValueException(Throwable cause) {
        super(cause);
    }

    public NoLifeValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
class GameRole {
    private String name;
    private int lifeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) throws Exception{
        if(lifeValue >= 0){
            this.lifeValue = lifeValue;
        }
        else{
            throw new NoLifeValueException("lifeValue error");
        }
    }
}


class GameRoleTest{
    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.setName("zzz");
        try{
            role.setLifeValue(-10);
        }catch (Exception e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
        int life = role.getLifeValue();
        System.out.println(life);

    }
}


