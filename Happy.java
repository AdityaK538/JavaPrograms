import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = N;
        int sum;
        int temp;
        while (true) {
            sum = 0;
            temp = N;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit);
                temp /= 10;
            }
            if (sum == 1) {
                System.out.println("happy number");
                break;
            }
            N = sum;
        }
    }
}
