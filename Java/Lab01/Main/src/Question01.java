import java.util.Objects;
import java.util.Scanner;

public class Question01 {

    public static void main(String[] args){

        Scanner word = new Scanner(System.in);

        // iterate the process
        boolean goAgain = true;
        while(goAgain){

            System.out.println("Enter an odd-length word");
            String userInput = word.nextLine();

            // checking user input length odd or even
            if( userInput.length() % 2 == 0){
                System.out.println("The word isn't an odd-length word." );
            }
            else{
                // getting middle character from word
                float wordLength = userInput.length();
                int midPoint = (int) Math.ceil(wordLength / 2);
                char middleChar = userInput.charAt(midPoint - 1);
                System.out.println("The middle character is: " + "'" +middleChar + "'");

                // Asking user to want to continue
                Scanner out = new Scanner(System.in);
                System.out.println("Do you want to go again? (y/n)");
                String answer = out.nextLine();

                // terminate condition
                if(Objects.equals(answer, "n" ) || Objects.equals(answer, "N")){
                    goAgain = false;
                }
            }
        }

        word.close();
    }
}