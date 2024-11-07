import java.util.Scanner;

public class Question02 {

    public static void main(String[] args){

        // Scanner object
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = userInput.nextLine();

        System.out.println("Enter your middle name: ");
        String middleName = userInput.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = userInput.nextLine();

        userInput.close();
        // defining name format
        String businessName = lastName + ", " + firstName + " " + middleName.charAt(0) + ".";
        System.out.println("Your business name is: \n" + businessName );

    }
}