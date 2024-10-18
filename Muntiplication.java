import java.util.Scanner;

public class Muntiplication {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int G = scan.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(G + " x " + i + " = " + G * i);
        }
    }
}
