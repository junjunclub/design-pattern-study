package strategypattern;

public class Checkout {

    private final PayStrategy payStrategy;

    public Checkout (PayStrategy ps) {
        this.payStrategy = ps;
    }

    public void pay(int amount) {
        payStrategy.pay(amount);
    }
}
