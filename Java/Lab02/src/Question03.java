import java.util.Scanner;


// row = 4

// |   *        r=1, s=3
// |  * *       r=2, s=2
// | * * *      r=3, s=1
// |* * * *     r=4 , s=0


public class Question03 {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows that want to include in pyramid: ");
        int rows = scanner.nextInt();

        int space = rows - 1;  
        for(int i=1; i<=rows; i++){
            // iterating number of rows

            for(int j=space; j>0; j--){
                // printing spaces before stars
                System.out.print(" ");
            }
            space--;

            for(int k=0; k<i; k++){
                System.out.print("* ");
            }

            System.out.println();

        }
        scanner.close();

    
    }

}

