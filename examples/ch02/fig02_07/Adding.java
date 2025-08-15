import java.util.Locale;
import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        System.out.print("Enter your first nr : ");
        int nr1 = inpt.nextInt();
        System.out.print("Enter your first nr : ");
        int nr2 = inpt.nextInt();

        System.out.print("Enter your first nr : ");
        int nr3 = inpt.nextInt();


        int resultate = nr1 + nr2 + nr3 ;
        System.out.println("The resultat is " + resultate);
        System.out.printf(" Sum is %d%n", resultate);
        System.out.printf(Locale.US, "Sum is %d%n", resultate);

    }
}
