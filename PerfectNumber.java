import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n/2) {
//            System.out.println("1 "+i);
            if (n % i == 0) {
                sum += i;
//                System.out.println("2 " +i );
//                System.out.println(sum);
            }
            i++;
        }
        if (sum == n) {
            System.out.println("Perfect");
        }else{
            System.out.println("Not Perfect");
        }
    }
}
