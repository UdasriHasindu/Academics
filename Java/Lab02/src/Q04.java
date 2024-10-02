import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Q04 {

    public static int getIndex(int[] arr, int element){

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter the five numbers: ");

        for(int i=0; i<5; i++){
            arr[i] = scanner.nextInt();
        }

        int max = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];

            }
        }
        System.out.println(max);

        int maxIndex = getIndex(arr, max);
        System.out.print("The index of max = " + maxIndex);




    }
}
