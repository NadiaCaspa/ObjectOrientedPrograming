public class Vehicle {
    public int year;
    public String make;
    public String model;

    public Vehicle(int year, String make, String model){ // constuctor parameter list
         this.year = year;
        this.make = make;
        this.model = model;

    }
    public void displayCarDetails(){ // instant methods
        System.out.println("Make: " + make);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }
}
