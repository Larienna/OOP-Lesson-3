package Task3;

/*
Using IntelliJ IDEA, create a project. Required: Create a Vehicle class.
In the body of the class, create fields: coordinates and parameters of ships (price, speed, year of manufacture).
Create 3 derived classes Plane, Sag and Ship. The height and number of passengers must be defined for the Plane class.
For the Ship class - the number of passengers and port of origin.
Write a program that displays information about each means of transportation on the screen.
 */
public class Vehicle {
    private int x; // x and y coordinates
    private int y;
    private double price; // price in dollars
    private double speed; // speed in km/h
    private int yearOfManufacture; // year of manufacture

    //constructor
    public Vehicle(int x, int y, int price, int speed, int yearOfManufacture) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.yearOfManufacture = yearOfManufacture;
    }

    // Coordinates
    public void move(int newX, int newY) {
        System.out.println("Moving to coordinates (" + newX + ", " + newY + ")");
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "x = " + x +
                ", y = " + y +
                ", price = " + price +
                ", speed = " + speed +
                ", year = " + yearOfManufacture +
                '}';
    }
}

class Plane extends Vehicle {
    private int height;
    private int passengers;

    public Plane(int x, int y, double price, double speed, int yearOfManufacture, int height, int passengers) {
        super(x, y, (int) price, (int) speed, yearOfManufacture);
        // Special parameters: height and passengers for Plane
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return super.toString() + " Plane {" +
                "height = " + height +
                ", passengers = " + passengers +
                '}';
    }
}

class Car extends Vehicle {
    public Car(int x, int y, double price, double speed, int yearOfManufacture) {
        super(x, y, (int) price, (int) speed, yearOfManufacture);
    }
}

class Ship extends Vehicle {
    private int passengers;
    private String port;

    public Ship(int x, int y, double price, double speed, int yearOfManufacture, int passengers, String port) {
        super(x, y, (int) price, (int) speed, yearOfManufacture);
        this.passengers = passengers; // Special parameter: Passengers
        this.port = port;
    }

    @Override
    public String toString() {
        return super.toString() + " Ship {" +
                "passengers = " + passengers +
                ", port = " + port + '\'' +
                '}';
    }
}

