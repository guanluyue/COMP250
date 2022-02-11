package assignment1;

public class Egg extends MarketProduct {
    private int numberOfEggs;
    private int pricePerDozen;

    public Egg(String name, int n, int p) {
        super(name);
        this.numberOfEggs = n;
        this.pricePerDozen = p;
    }

    public int getCost() {
        double numOfDozens = ((double)this.numberOfEggs) / 12;
        return (int) (numOfDozens * this.pricePerDozen);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Egg)) {
            return false;
        } else {
            Egg newObj = (Egg) obj;
            if (!this.getName().equals(newObj.getName())) {
                return false;
            } else if (this.getCost() != newObj.getCost()) {
                return false;
            } else if (this.numberOfEggs != newObj.numberOfEggs) {
                return false;
            }
            return true;
        }
    }

    /*public static void main (String[] args) {
        Egg egg1 = new Egg("Fancy Eggs", 4, 380);
        Egg egg2 = new Egg("Fancy Eggs", 4, 380);
        System.out.println(egg1.equals(egg2));

     */

}

