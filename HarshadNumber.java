import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        int M = N;
        while (N > 0) {
            int R = N % 10;
            sum = sum + R;
            N = N / 10;
        }
        if (sum / M == 0) {
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
}
