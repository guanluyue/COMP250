package assignment1;

public class Fruit extends MarketProduct{
    private double weight;
    private int price;

    public Fruit(String n, double w, int p) {
        super(n);
        this.weight = w;
        this.price = p;
    }

    public int getCost() {
        return (int) (this.weight * this.price);
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals = true;
        if (!(obj instanceof Fruit)){
            equals = false;
        }else{
            Fruit newObj = (Fruit) obj;
        if (this.getName() != (newObj.getName())){
            equals = false;
        }
        if (this.getCost() != newObj.getCost()){
            equals = false;
        }
        if (this.weight != newObj.weight)
            equals =  false;

        }
        return equals;
    }
}
