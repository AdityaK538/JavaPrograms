public class Swapping2 {
    public static void main(String[] args){
        int P = 30;
        int Q = 49;

        P = P + Q;
        Q = P - Q;
        P = P - Q;
        System.out.println(P);
        System.out.println(Q);
    }
}
