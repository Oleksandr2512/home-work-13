public class Car {
    String model;
    int year;
    String manufacturer;

    // Static field for the total number of cars produced
    static int totalCarsProduced = 0;

    // Constructor to initialize the car
    public Car(String model, int year, String manufacturer) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        totalCarsProduced++; // Increment the total number of cars produced
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Manufacturer: " + manufacturer);
    }

    // Static method to get the total number of cars produced
    public static int getTotalCarsProduced() {
        return totalCarsProduced;
    }
}
