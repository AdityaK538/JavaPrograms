import java.util.Scanner;

public class AutoMorphicNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = N;
        int count = 0;
        int S = N*N;
        int P = 0;
        int Q = 0;

        while(N > 0){
            N = N/ 10;
            count++;
        }
//        System.out.println("Count " + count);
        N = M;
        for(int I = 1; I <= count; I++){
            int R = S % 10;
//            System.out.println("Reminder" + R);
            P = P * 10 + R;
            S = S / 10;
        }
//        System.out.println("Expected last digit " + P);
        while(P > 0){
            int Z = P % 10;
            Q = Q * 10 + Z;
            P /= 10;
        }
//        System.out.println(" Reverse Last digit " +Q);
        if(Q == M){
        System.out.println(M + " Morphic Number");
        }else{
            System.out.println(M + " Not Morphic Number");
        }
    }
}
