public class Factor1 {
    public static void main(String[] args) {
        int R = 30;
        for (int i = 1; i <= (R/2); i++) {
            if (i % 2 == 0) {
                int J=(R/i);
                if(J <= 30 ){
                    System.out.println(i + "and" +J);
                }

            }
        }
    }
}
