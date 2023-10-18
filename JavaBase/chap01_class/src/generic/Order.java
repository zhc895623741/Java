package generic;

public class Order<T> {

    public Order() {
    }

    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
