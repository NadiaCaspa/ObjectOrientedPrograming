public class Overloading {
    public static void main(String[] args) {

        System.out.println(Sum(2, 3.4));
        System.out.println(Sum(3.9, 4));
    }
    public static double Sum(int num1, double num2)
    {
        return num1 + num2;
    }
    public static double Sum(double num1, int num2)
    {
        return num1 + num2;
    }
}

