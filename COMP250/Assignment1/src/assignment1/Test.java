package assignment1;

public class Test {
    public static void main(String args[]){
        Egg egg3 = new Egg("egg3",12,100);
        Fruit fruit3 = new Fruit("Fruit3",1,100);
        Jam jam3 = new Jam("jam3",1,100);
        SeasonalFruit seasonalFruit2 = new SeasonalFruit("seasonal3", 1, 100);


        Basket basket1 = new Basket();
        basket1.add(egg3);
        basket1.add(fruit3);
        basket1.add(jam3);
        basket1.add(seasonalFruit2);
        int num=basket1.getNumOfProducts();
        if ( num != 4){
            throw new AssertionError("getNumOfProducts() returned " + num
                    + " but expected " + 4);
        }
        System.out.println(" Add product to basket Test passed.");
        String expected = "egg3\t1.00\n" +
                "Fruit3\t1.00\n" +
                "jam3\t1.00\n" +
                "seasonal3\t0.85\n" +
                "\n" +
                "Subtotal\t3.85\n" +
                "Total Tax\t0.15\n" +
                "\n" +
                "Total Cost\t4.00";
        String actual = basket1.toString().trim();
        System.out.println("Expected: \n" + expected + "\n" + "\nReceived: \n" + actual);
        if (!actual.equals(expected))
            throw new AssertionError("Incorrect format ");
        System.out.println("Basket toString test passed. ");
        Boolean a = basket1.remove(jam3);
        Boolean b = basket1.remove(jam3);
        if(!a || b){
            throw new AssertionError("Expected: " + "a=true & b=false"
                    + " but obtained: " + "a=" + a + " & b=" + b);
        }
        System.out.println("Basket remove test passed.");
        expected = "egg3\t1.00\n" +
                "Fruit3\t1.00\n" +
                "seasonal3\t0.85\n" +
                "\n" +
                "Subtotal\t2.85\n" +
                "Total Tax\t-\n" +
                "\n" +
                "Total Cost\t2.85";
        actual = basket1.toString().trim();
        System.out.println("Expected: \n" + expected + "\n" + "\nReceived: \n" + actual);
        if (!actual.equals(expected))
            throw new AssertionError("Incorrect format ");
        System.out.println("Basket toString test passed. ");

        basket1.clear();
        MarketProduct[] l = basket1.getProducts();
        if (l.length != 0)
            throw new AssertionError("Expected the MarketProduct array to be empty, but it was not. ");
        System.out.println("Basket clear test passed.");

        expected =
                "Subtotal\t-\n" +
                        "Total Tax\t-\n" +
                        "\n" +
                        "Total Cost\t-";
        actual = basket1.toString().trim();
        System.out.println("Expected: \n" + expected + "\n" + "\nReceived: \n" + actual);
        if (!actual.equals(expected))
            throw new AssertionError("Incorrect format ");
        System.out.println("Empty Basket toString test passed. ");

    }
}
