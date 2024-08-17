import java.util.Scanner;

public class Question05 {

    public static final float PI = 3.14159f;
    public static void main(String[] args) {
        
        Scanner uScanner = new Scanner(System.in);
        System.out.println("Enter the inner radius: ");
        float R_in = uScanner.nextFloat();
        
        System.out.println("Enter the outer radius: ");
        float R_out = uScanner.nextFloat();

        double innerArea = PI * Math.pow(R_in, 2);
        double outerArea = PI * Math.pow(R_out, 2);

        double shadedArea = outerArea - innerArea;

        System.out.println("The are of shaded area is : "+ Math.round(shadedArea));

    }
}