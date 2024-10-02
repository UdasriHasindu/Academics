public class Q02 {

    public static int countNumbers(long num) {

        int count = 1;
        while (num >= 10) {
            num = num / 10;
            count++;

        }
        return count;

    }

    public static void main(String[] arg) {

        int counts = countNumbers(1544515);
        System.out.println(counts);

    }
}
