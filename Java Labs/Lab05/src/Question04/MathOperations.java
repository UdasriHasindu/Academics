package Question04;

public class MathOperations {

    final private static double PI = 3.14159;

    public static double calculateCircleArea(double radius){
        return PI * radius * radius;
    }

    public static double calculateSquareArea(double side){
        return side * side;
    }

    public static double getPI(){
        return PI;
    }

}
