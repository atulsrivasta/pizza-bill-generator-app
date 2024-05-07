import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> pizzas;

    public Order() {
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Pizza pizza : pizzas) {
            total += pizza.getBasePrice();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Your Order:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
