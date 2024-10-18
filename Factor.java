public class Factor {
    public static void main(String [] args){
        int R = 20;
        for(int I = 0; I <= R; I++ ){
            if(I%2 == 0){
                System.out.println(I + " Is factor");
            }else{
                System.out.println(I + " Is not factor");
            }
        }
    }
}
