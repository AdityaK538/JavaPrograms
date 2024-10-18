public class heart {
    public static void main(String[] args) {
        for (int I = 0; I < 6; I++) {
            for (int J = 0; J <= 6; J++) {
                if ((I == 0 && J%3 != 0) || (I == 1 && J%3 == 0) || (I - J == 2 || I + J ==8)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
