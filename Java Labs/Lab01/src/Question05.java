import java.util.Scanner;

public class Question05 {

    // Circle class
    public static class Circle{

        private double radius;
        // constructor to set radius
        public Circle(double radius){
            this.radius = radius;
        }

        public void setRadius(double radius){
            this.radius = radius; // Method to set radius
        }

        // default constructor
        public Circle(){
            this.radius = 0;
        }

        public double computeArea(){
            return Math.PI * radius * radius;
        }

        public double computeCircumference(){
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {


        Scanner uScanner = new Scanner(System.in);

        System.out.println("Enter the inner radius: ");
        double R_in = uScanner.nextDouble();

        System.out.println("Enter the outer radius: ");
        double R_out = uScanner.nextDouble();

        if(R_in > R_out){
            System.out.println("The inner radius is greater than the outer radius");
            return;
        }

        // new circle objects
        Circle innerCircle = new Circle(R_in);
        Circle outerCircle = new Circle(R_out);

        double outerCircumference = outerCircle.computeCircumference();
        double innerCircumference = innerCircle.computeCircumference();
        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        // printing details
        System.out.println("Details of the Circle\n");
        System.out.printf("Outer Circumference = %.3f%n", outerCircumference);
        System.out.printf("inner Circumference = %.3f%n", innerCircumference);
        System.out.printf("\nThe area of circular region = %.3f%n", shadedArea);

    }
}
