
public class Main {
    public static void main(String[] arg) {

        int j=0;
        for(int i = 10; i < 50; i++){
            ++j;
            if (j > 10){
               System.out.println();
               j =1;

            }
            System.out.print(i + " ");
        }
    }
}