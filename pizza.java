public class Pizza {
    private String size; // e.g., Small, Medium, Large
    private int numToppings;
    private double basePrice;

    public Pizza(String size, int numToppings) {
        this.size = size;
        this.numToppings = numToppings;
        this.basePrice = calculateBasePrice();
    }

    private double calculateBasePrice() {
        switch (size.toLowerCase()) {
            case "small":
                return 8.0 + 1.0 * numToppings; // Base price plus 1.0 for each topping
            case "medium":
                return 10.0 + 1.5 * numToppings; // Base price plus 1.5 for each topping
            case "large":
                return 12.0 + 2.0 * numToppings; // Base price plus 2.0 for each topping
            default:
                throw new IllegalArgumentException("Unknown size: " + size);
        }
    }

    public String getSize() {
        return size;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return size + " pizza with " + numToppings + " toppings - $" + basePrice;
    }
}
