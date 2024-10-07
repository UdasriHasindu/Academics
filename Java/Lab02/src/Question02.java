import java.util.Scanner;

public class Question02 {

    public static int countNumbers(long num) {

        if(num >= 0){

            int count = 1;
            while (num >= 10) {
                num = num / 10;
                count++;
    
            }
            return count;
        }
        return -1;

    }

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);


        int num = 0;
        while (num >= 0){

            System.out.println("Enter a number: ");
            num = scan.nextInt();

            int counts = countNumbers(num);

            if( counts >= 0){

                System.out.println("Number of digits = " + counts);
            }
            else{
                System.out.println("Negative number");
            }
        }


        scan.close();
    } 
}
