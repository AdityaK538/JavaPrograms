import java.util.Scanner;
public class ProductOfNth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int product = 1;
        for(int I = 1; I <= T; I++){
            product = product * I;
            System.out.println(product);
        }

    }
}
