package Task3;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(0, 0, 1000, 200, 2020);
        Plane plane = new Plane(10, 10, 100000, 1000, 2010, 5000, 200);
        Car car = new Car(5, 5, 5000, 100, 2015);
        Ship ship = new Ship(20, 20, 200000, 50, 2005, 1000, "Port");

        System.out.println(vehicle);
        System.out.println(plane);
        System.out.println(car);
        System.out.println(ship);
    }
}
