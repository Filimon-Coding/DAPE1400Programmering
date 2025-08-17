import java.util.Scanner;

public class Sec3p8 {
    public static void main(String[] args) {


        int total = 0;

        int studentEnteries = 0;

        Scanner input = new Scanner(System.in);


        while (true){
            System.out.print("Enter your grade : or Q to quit ");
            int studentGrade = input.nextInt();

            if (studentGrade == -1){
                break;
            }else {
                studentEnteries = studentEnteries + 1;
                total = total + studentGrade;

            }

        }
        int averageGrade = (total /studentEnteries);
        System.out.printf("%s%d%n%s%d", "Average grade is ", averageGrade, "out of total student enteries ", studentEnteries );



    }

}
