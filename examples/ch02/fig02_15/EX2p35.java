// Statistics for the great pyramid of Giza Calculator


import java.util.Scanner;

public class EX2p35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the esitimate nummber of Stones : ");
        double stonesNr = input.nextDouble();

        System.out.print("Weight of the bigges stone : ");
        double stonesBig = input.nextDouble();

        System.out.print("Weight of the miduim stone : ");
        double stonesMid = input.nextDouble();

        System.out.print("Weight of the smalles stone : ");
        double stonesSmall = input.nextDouble();

        double averageStoneWeight = ((stonesBig + stonesMid + stonesSmall)/(3));

        System.out.print("How many years it took : ");
        double yearsTook = input.nextDouble();

        double resultsKgPerYear = ((stonesNr * averageStoneWeight)/(yearsTook));
        double resultskgPerdays =  (resultsKgPerYear/365);
        double resulsKgPerHour = (resultskgPerdays/24);
        double resultsKgPerMinutt = (resulsKgPerHour/60);
        double resultsKgPerSeconds = (resultsKgPerMinutt/60);

        System.out.printf("%s%f%n","Kg Per Year : ", resultsKgPerYear );
        System.out.printf("%s%f%n","Kg Per day : ", resultskgPerdays );
        System.out.printf("%s%f%n","Kg Per hour : ", resulsKgPerHour );
        System.out.printf("%s%f%n","Kg Per minute : ", resultsKgPerMinutt );
        System.out.printf("%s%f%n","Kg Per Seconds : ", resultsKgPerSeconds );
    }

}

// Works well but here the suggested code from AI 5

/*
// Statistics for the Great Pyramid of Giza — calculator
import java.util.Scanner;

public class Ex2_35 {
    public static void main(String[] args) {
        final int DAYS_PER_YEAR = 365;
        final int HOURS_PER_DAY = 24;
        final int MIN_PER_HOUR = 60;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Estimated number of stones used: ");
            long stonesCount = input.nextLong();

            System.out.print("Average weight per stone (kg): ");
            double avgStoneKg = input.nextDouble();

            System.out.print("Years taken to build (365-day years): ");
            int years = input.nextInt();

            double totalWeightKg = stonesCount * avgStoneKg;
            double kgPerYear   = totalWeightKg / years;
            double kgPerHour   = kgPerYear / (DAYS_PER_YEAR * HOURS_PER_DAY);
            double kgPerMinute = kgPerHour / MIN_PER_HOUR;

            System.out.printf("Estimated total weight: %,.2f kg%n", totalWeightKg);
            System.out.printf("Built per year:   %,.2f kg%n", kgPerYear);
            System.out.printf("Built per hour:   %,.6f kg%n", kgPerHour);
            System.out.printf("Built per minute: %,.6f kg%n", kgPerMinute);
        }
    }
}

 */