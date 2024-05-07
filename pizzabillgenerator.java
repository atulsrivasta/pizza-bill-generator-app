import java.util.Scanner;

public class PizzaBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            System.out.print("Enter pizza size (small, medium, large) or 'done' to finish: ");
            String size = scanner.nextLine();

            if ("done".equalsIgnoreCase(size)) {
                break;
            }

            System.out.print("Enter the number of toppings: ");
            int numToppings = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            Pizza pizza = new Pizza(size, numToppings);
            order.addPizza(pizza);

            System.out.println("Pizza added: " + pizza);
        }

        order.printOrder();
        scanner.close();
    }
}
