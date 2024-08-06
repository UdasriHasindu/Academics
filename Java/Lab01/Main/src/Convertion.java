import java.util.Scanner;


public class Convertion {


    // 1 ft --> 30.48 cm 
    public static final float  ft_cm = 30.48f;
    // 1 inch --> 2.54 cm 
    public static final float inch_cm = 2.54f;


    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the length in Centemetres: ");
        float centemetres = userInput.nextFloat();

        float feets = centemetres / ft_cm;
        float feetsRemain = centemetres % ft_cm;

        float inch = feetsRemain / inch_cm;
        double roundFeet = Math.floor(feets);

        System.out.println(centemetres + "cm = " + roundFeet + "ft & " + inch + "inch" );

    }
}
