//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task01");
        // Creating objects of the Dish class
        Dish soup = new Dish("Soup", 50.0, "Appetizer");
        Dish pizza = new Dish("Pizza", 120.0, "Main Course");
        Dish iceCream = new Dish("Ice Cream", 30.0, "Dessert");

        // Adding dishes to the restaurant menu
        Restaurant.addDish(soup);
        Restaurant.addDish(pizza);
        Restaurant.addDish(iceCream);

        // Displaying information about all dishes
        for (Dish dish : Restaurant.dishes) {
            dish.displayInfo();
        }

        // Displaying the total number of dishes in the menu
        System.out.println("Total number of dishes in the menu: " + Restaurant.getTotalDishes());

        System.out.println("Task02");
        // Creating car objects
        Car tesla = new Car("Tesla Model S", 2023, "Tesla");
        Car ford = new Car("Ford Mustang", 2024, "Ford");

        // Displaying information about each car
        tesla.displayInfo();
        ford.displayInfo();

        // Displaying the total number of cars produced
        System.out.println("Total number of cars produced: " + Car.getTotalCarsProduced());
    }
}
