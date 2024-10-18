import java.util.Scanner;
public class SumOfNth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int sum = 0;
        for(int I = 1; I <= V; I++){
            sum = sum + I;
            System.out.println(sum);
        }

    }
}
