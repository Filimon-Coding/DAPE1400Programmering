import java.util.Scanner;

// Calulatetor for BMI
public class Ex2p33 {
    public static void main(String[] args) {


        Scanner innput = new Scanner(System.in);
        System.out.println("Enter weight in kgs ");
        double weight = innput.nextDouble();
        System.out.println("Enter height in meters ");
        double height = innput.nextDouble();


        double BMI = ((weight) / (height * height));

        System.out.printf("%s%d", "Din BMI er ", BMI);

    }
}
