package assignment1;

public class Jam extends MarketProduct {
    private int numberOfJars;
    private int price;

    public Jam(String n, int num, int p) {
        // TODO Auto-generated constructor stub
        super(n);
        this.numberOfJars = num;
        this.price = p;
    }

    public int getCost() {
        return this.numberOfJars * this.price;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Jam)) {
            return false;
        } else {
            Jam newObj = (Jam) obj;
            if (this.getName() != (newObj.getName()))
                return false;
            else if (this.getCost() != (newObj.getCost()))
                return false;
            else if (this.numberOfJars != newObj.numberOfJars)
                return false;
            return true;
        }
    }
}