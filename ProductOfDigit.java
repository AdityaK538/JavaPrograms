import java.util.Scanner;
public class ProductOfDigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int J = scan.nextInt();
        int prod = 1;
        while(J > 0){
            int I = J % 10;
            prod *= I;
            J /= 10;
        }
        System.out.println(prod);

    }
}
