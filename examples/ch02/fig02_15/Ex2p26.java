import java.util.Scanner;

public class Ex2p26 {
    public static void main(String[] args) {

        Scanner inpt = new Scanner(System.in);


        int first = inpt.nextInt();
        int second = inpt.nextInt();

        if (first >= 3 * (second *2)){
            System.out.printf("%s%d%n%s%d", "First nummber : ", first, "Tripples the double of : ", second);
        }else {
            System.out.println("the first does not tripple the double of the second ");
        }

    }
}
