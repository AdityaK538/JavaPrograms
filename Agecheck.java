import java.util.Scanner;

public class Agecheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N > 17){
            System.out.println("Can vote.");
        }else{
            System.out.println("Can not vote.");
        }
    }
}
