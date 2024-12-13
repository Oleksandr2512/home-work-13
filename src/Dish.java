public class Dish {
    String name;
    double price;
    String category;

    // Constructor to initialize the dish
    public Dish(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Method to display information about the dish
    public void displayInfo() {
        System.out.println("Name: " + name + ", Price: " + price + ", Category: " + category);
    }
}

