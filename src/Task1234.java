public class Task1234 {
    void main(String[] args) {

        // Task 1: Counts up by 1 from 0 to 30
        System.out.println("--- Task 1 ---");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 2: Counts down by 1 from 30 to 0
        System.out.println("--- Task 2 ---");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 3: Counts up by 3 from 0 to 18
        System.out.println("--- Task 3 ---");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Task 4: Counts down by 2 from 10 to 0
        System.out.println("--- Task 4 ---");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}