package assignment1;

public class Basket {
    private MarketProduct[] products;

    public Basket() {
        this.products = new MarketProduct[0];
    }

    public MarketProduct[] getProducts() {
        return products.clone();
    }

    public void add(MarketProduct product) {
        MarketProduct[] newProducts = new MarketProduct[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newProducts[i] = products[i];
        }
        newProducts[products.length] = product;
        products = newProducts;
    }

    public boolean remove(MarketProduct product) {
        if (this.products.length == 0) {
            return false;
        }
        MarketProduct[] newProducts = new MarketProduct[products.length - 1];
        int index = 0;
        boolean exist = false;
        for (int i = 0; i < products.length; i++) {
            if (product.equals(products[i])) {
                index = i;
                exist = true;
                break;
            }
        }
        if (exist) {
            for (int i = 0; i < index; i++) {
                newProducts[i] = products[i];
            }
            for (int i = index; i < products.length - 1; i++) {
                newProducts[i] = products[i + 1];
            }
            products = newProducts;
            return true;
        }else{
            return false;
        }
    }

    public void clear(){
            products = new MarketProduct[0];
    }

    public int getNumOfProducts(){
        return products.length;
    }

    public int getSubTotal(){
        int subTotal = 0;
        for (int i=0; i < products.length; i++){
            subTotal += products[i].getCost();
        }
        return subTotal;
    }

    public int getTotalTax(){
        int totalTax = 0;
        for (int i=0; i < products.length; i++){
            if (products[i] instanceof Jam){
                totalTax += (int) (products[i].getCost() * 0.15);
            }
        }
        return totalTax;
    }

    public int getTotalCost(){
        return this.getSubTotal() + this.getTotalTax();
    }

    private static String getCents(int cents) {
        if (cents <= 0) {
            return "-";
        }else{
            double dollars = ((double)cents) / 100;
            return String.format("%.2f", dollars);
        }
    }
    @Override
    public String toString() {
        String s ="";
        for (int i=0; i<products.length; i++) {
            int intCost = products[i].getCost();
            String dblCost = getCents(intCost);
            s += products[i].getName() + "\t" + dblCost + "\n";
        }
        s += "\n";
        s += ("Subtotal\t" + getCents(this.getSubTotal()) + "\n"
                +"Total Tax\t" + getCents(this.getTotalTax()) + "\n");
        s += "\n";
        s += ("Total Cost\t" + getCents(this.getTotalCost()));
        return s;
    }


   /*public static void main (String[] args) {

   }
        /*Basket basket = new Basket();
        basket.add(new Egg("brown", 24, 4));
        basket.add(new Fruit("kiwi", 2.0, 100));
        String expected = "brown\t0.08\n" +
                "kiwi\t2.00\n" +
                "\n" +
                "Subtotal\t2.08\n" +
                "Total Tax\t-\n" +
                "\n" +
                "Total Cost\t2.08";
        String actual = basket.toString();
        System.out.println(expected);
        System.out.println(actual);
        //if (!actual.equals(expected))
            //throw new AssertionError("Incorrect format ");
        //System.out.println("Basket toString test passed. ");
    }

    */






}
