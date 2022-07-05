public class Clothing {
    public double price;
    public String type;
    public String size;

    public static int numberOfCount = 0;

    public  Clothing(){
        price = 29.9;
        type = "t-shirt";
        size =  "medium";
        numberOfCount++;
   }
    public Clothing( double price,String type,String size){
        this.price = price;
        this.type = type;
        this.size = size;
        numberOfCount++;
    }
    public void increasePrice(){
        this.price = price + 5; // or price +=5
    }

    public void increasePrice(double x){
        this.price = price + x;
    }
    public void details(){
        System.out.println("price: $" + price);
        System.out.println("size: " + size);
        System.out.println("type: " + type);
        System.out.println();
    }

    public String blah(){
        return "\n Hello World" + "\n Hello World" + "\n Hello World";
    }
}
