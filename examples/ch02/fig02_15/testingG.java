import java.util.Scanner;

public class testingG {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 2){
            System.out.print("Enter Grad : ");
            int grade = input.nextInt();
            total =total + grade;
            gradeCounter = gradeCounter + 1;

        }

        int average = total /2;
        System.out.printf("%s%d", "Average is ", average);




    }
}
