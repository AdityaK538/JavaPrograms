import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int Z = 0;
        if(T == 1){
            System.out.println("1 is not a prime nor composite");
            return;
        }
        for(int I = 2; I <= T/2; I++){
            if(T % I == 0){
                Z++;
//                System.out.println(I);
            }
        }
        if(Z >= 1){
            System.out.println(T + " not a prime number");
        }else{
            System.out.println(T + " a prime number");
        }




    }
}
