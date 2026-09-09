public class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Main Method
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Black", 120);
        myCar.displayDetails();
    }
}
