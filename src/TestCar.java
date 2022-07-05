public class TestCar {
    public static void main(String[] args) {
        Car c = new Car(2015, "Ford", "Explorer");
        c.displayCarDetails();
        System.out.println();

        Car c2 = new Car();
        c2.displayCarDetails();
        System.out.println();
        System.out.println("Car Count: " + Car.carCount); //
    }
}
