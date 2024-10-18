import java.util.Scanner;
public class ReverceDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int W = 0;
        while(V > 0){
            int X =V % 10;
            W = W * 10 + X;
            V /= 10;
        }
        System.out.println(W);
    }
}
