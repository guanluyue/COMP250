package assignment1;

public abstract class MarketProduct {
        private String name;

        public MarketProduct(String n) {
            this.name = n;
        }

        public final String getName() {
            return this.name;
        }

        public abstract int getCost();
        public abstract boolean equals(Object obj);

}
