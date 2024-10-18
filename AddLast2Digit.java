import java.util.Scanner;
public class AddLast2Digit {
    public static void main(String[] args){
        int Q = 0;
        int R = 1;
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        System.out.print(Q + " ");
        System.out.print(R + " ");
        for(int I = 3; I <= B; I++){
            int S = Q + R;
            System.out.print(S + " ");
            Q = R;
            R = S;
        }
    }
}
