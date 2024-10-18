import java.util.Scanner;
import java.lang.Math;

public class StringNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int E = scan.nextInt();
        int R = E;
        int fact = 0;
        int Count = 0;
        while(E > 0){
             E = E / 10;
            Count++;
        }
        System.out.println(Count);
        E = R;
        while(E > 0){
            int S = E % 10;
            fact = fact +(int) Math.pow(S , Count);
            E /= 10;
        }
        System.out.println(fact);
    }
}
