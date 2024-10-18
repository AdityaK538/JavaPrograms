import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        int sum2 = 0;
        while (N > 0) {
            int R = N % 10;
            sum = sum + R;
            N /= 10;
        }
        while (sum >= 10) {
            sum2 = 0;
            while (sum > 0) {
                int R2 = sum % 10;
                sum2 = sum2 + R2;
                sum /= 10;
            }
            sum = sum2;
        }
        if (sum == 1) {
            System.out.println("Magic number");
        } else {
            System.out.println("Not Magic number");
        }
    }
}
