import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char op = scan.next().charAt(0);
        if(op == 'a'){
            int P = scan.nextInt();
            int Q = scan.nextInt();
            int R = P + Q;
            System.out.println(R);
        }else if(op == 's'){
            int P = scan.nextInt();
            int Q = scan.nextInt();
            int R = P - Q;
            System.out.println(R);
        }else if(op == 'm'){
            int P = scan.nextInt();
            int Q = scan.nextInt();
            int R = P * Q;
            System.out.println(R);
        }else if(op == 'd'){
            int P = scan.nextInt();
            int Q = scan.nextInt();
            int R = P / Q;
            System.out.println(R);
        }else{
            System.out.println("Enter numbers again");
        }


    }
}
