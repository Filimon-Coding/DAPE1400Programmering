import java.util.Scanner;

public class Ex205 {
    public static void main(String[] args) {

        // Calculate tree integers

        Scanner inpt = new Scanner(System.in);
        int x = inpt.nextInt();
        int y = inpt.nextInt();
        int z = inpt.nextInt();

        int product = (x * y * z);

        System.out.printf("%s%d%n", "The product of three int x y z ", product);




    }
}
