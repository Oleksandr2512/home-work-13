import java.util.ArrayList;

public class Restaurant {
    // Static list to store the dishes
    static ArrayList<Dish> dishes = new ArrayList<>();

    // Method to add a new dish to the menu
    public static void addDish(Dish dish) {
        dishes.add(dish);
    }

    // Static method to get the total number of dishes on the menu
    public static int getTotalDishes() {
        return dishes.size();
    }
}
