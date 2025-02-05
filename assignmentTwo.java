import java.util.Random;
import java.util.Scanner;

public class assignmentTwo {

    public static int[] createRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101); // Generates a random integer between 0 and 100
        }
        return array;
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add your method call for option 1 here
                    System.out.println("Option 1 selected.");
                    break;
                case 2:
                    // Add your method call for option 2 here
                    System.out.println("Option 2 selected.");
                    break;
                case 3:
                    // Add your method call for option 3 here
                    System.out.println("Option 3 selected.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}