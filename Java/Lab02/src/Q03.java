import java.util.Scanner;


public class Q03 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the umber of rows that want to include in pyramid: ");
        int rows = scanner.nextInt();

        int count = 0;
        for(int i=0; i<=rows; i++){
            for(int j=0; j<i; j++){
                System.out.print("*") ;
            }

            System.out.println();
        }

    }
}
