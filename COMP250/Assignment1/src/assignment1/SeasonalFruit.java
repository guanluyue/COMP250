package assignment1;

public class SeasonalFruit extends Fruit{

    public SeasonalFruit(String n, double w, int p) {
        // TODO Auto-generated constructor stub
        super(n,w,p);
    }

    @Override
    public int getCost() {
        double discount = (double) (super.getCost() * 0.85);
        return (int) discount;
    }
}
