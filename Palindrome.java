import java.util.Scanner;
public class Palindrome {
    public static void main(String[] srgs){
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int M = L;
        int rev = 0;
        while(L > 0){
            int Q = L % 10;
            rev = rev * 10 + Q;
            L /= 10;
        }
        if(M == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
