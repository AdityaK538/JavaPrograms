import java.util.Scanner;
 class Sumofdigit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int sum = 0;
                while(K > 0){
                    int digit = K % 10;
                    sum += digit;
                    K /= 10;
                }
                System.out.println(sum);
    }
}
