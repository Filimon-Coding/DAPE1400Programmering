import java.util.Scanner;

public class Fig3p8 {
    public static void main(String[] args) {

        int totalt = 0;
        int gradeCounter=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade or -1 to close : ");
        int userGrade = input.nextInt();


        while (userGrade != -1){
            totalt = totalt + userGrade;
            gradeCounter = gradeCounter+1;
            System.out.print("Enter grade or -1 to close : ");
            userGrade = input.nextInt();
        }

        if (gradeCounter == 0){
            System.out.println("No grades were entered");

        }else {

        double average = ((double) totalt / gradeCounter);
        System.out.printf("%s%f%s%d", "Average grades were : ", average, " Totalt amount grades  " , gradeCounter);

        }



    }
}
