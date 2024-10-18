import java.util.Scanner;

public class Intchecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int D1 = scan.nextInt();
        System.out.println("Enter second number");
        int D2 = scan.nextInt();
        System.out.println("Enter third number");
        int D3 = scan.nextInt();

        if(D1 > D2 && D1 > D3){
            System.out.println(D1);
        }else if(D2 > D3){
            System.out.println(D2);
        }else{
            System.out.println(D3);
        }

    }
}
