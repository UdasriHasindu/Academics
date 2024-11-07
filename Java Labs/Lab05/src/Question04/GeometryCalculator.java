package Question04;

public class GeometryCalculator {
    public static void main(String[] args) {

        double radius = 5 , side = 4;

        System.out.println("Value of PI = " + MathOperations.getPI());
        System.out.println("Area of a circle =" + MathOperations.calculateCircleArea(radius));
        System.out.println("Area of square = " + MathOperations.calculateSquareArea(side));
    }


}

