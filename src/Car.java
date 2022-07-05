public class Car {
    // instance variable each have their own variable, they do not have the static key work
        public int year;
        public String make;
        public String model;


        public static int carCount = 0;   // they don't belong to an object but belong to a class. All the objects share the value that is called carCount


        public Car(int y, String mk, String md){
            this.year = y;
            this. make = mk;
            this. model = md;
            carCount++;

        }
        public Car(){
            this.year = 1900;
           this.make = "First Car";
            this.model = "First Model";
            carCount++;
        }

        public void displayCarDetails(){ // these are instance methods (used to access instance variables)
            int year = 2020;
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
        public static void printCarCount(){  // you can not access anything that i not static from a static method
            System.out.println("Car Count:" + carCount);
        }
    }
