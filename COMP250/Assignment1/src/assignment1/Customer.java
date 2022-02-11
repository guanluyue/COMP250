package assignment1;

public class Customer {
    private String name;
    private int balance;
    private Basket basket;

    public Customer(String name, int balance) {
        this.basket = new Basket();
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public Basket getBasket() {
        return basket;
    }

    public int addFunds(int cents) {
        if (cents < 0) {
            throw new IllegalArgumentException("Please enter a positive number");
        } else {
            this.balance += cents;
            return this.balance;
        }
    }

    public void addToBasket(MarketProduct p) {
        this.basket.add(p);
    }

    public boolean removeFromBasket(MarketProduct p) {
        return this.basket.remove(p);
    }

    public String checkOut() {
        if (this.basket.getTotalCost() > this.balance) {
            throw new IllegalStateException("Insufficient Funds");
        } else {
            this.balance = this.balance - this.basket.getTotalCost();
            String receipt = this.basket.toString();
            this.basket.clear();
            return receipt;

        }
    }
}
