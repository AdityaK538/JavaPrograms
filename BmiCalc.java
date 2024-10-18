import java.util.Scanner;

public class BmiCalc {
    static float height_number;
    static float weight_number;
    static int bmi;
    static String bmi_type;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Height");
        height_number = scan.nextInt();
        float high_meter = height_number / 100;
        System.out.println("Enter Weight");
        weight_number = scan.nextInt();
        float bmi = weight_number / (high_meter * high_meter);
        if(bmi < 18.5) bmi_type = "Underweight";
            else if(bmi < 25) bmi_type = "Normal";
            else if(bmi < 30) bmi_type = "Overweight";
            else if(bmi < 35) bmi_type = "Obese";
            else if(bmi < 50) bmi_type = "Obese";
            else  System.out.println("Try again");
        System.out.println("BMI is " + bmi);
        System.out.println("Your BMI is " + bmi_type);
    }
}