import java.util.Scanner;

public class WriteStatments {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter first integer : ");
         int inpt1 = inpt.nextInt();


        System.out.println("This is a Java program");
        System.out.println("This is \n a Java\n program");

        System.out.printf("%s%s%n%n", "This is java " , "Program ok!");

        if (inpt1 != 7) {
            System.out.printf("%s%d%s%d%n","The integer input " , inpt1 , " is not equal ", 7);
        }

        if (inpt1 >= 7) { // can not write => since that is not expression (error intelij )
            System.out.println("c is equal to or greater than 7");
        }


    }
}
