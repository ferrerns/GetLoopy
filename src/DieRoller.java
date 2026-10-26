import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("y")) {
            // Print table header
            System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 0;
            boolean gotTriple = false;

            // Loop until a triple is rolled
            while (!gotTriple) {
                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Print row using printf
                System.out.printf("%-10d %-10d %-10d %-10d %-10d\n", rollCount, die1, die2, die3, sum);

                // Check if all three dice match
                if (die1 == die2 && die2 == die3) {
                    gotTriple = true;
                    System.out.println("\n🎉 Triple found! All dice showed " + die1 + " on roll " + rollCount + ".\n");
                }
            }

            // Prompt user to continue or quit
            System.out.print("Do you want to run the Die Roller again? (y/n): ");
            playAgain = scanner.nextLine();
            System.out.println();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
