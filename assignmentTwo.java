import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class assignmentTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Creation of integer array now.
        int[] arr = createRandomArray(10);
        System.out.println("An array of size 10 that contains random integers between 0 and 100 has been created.\n" + Arrays.toString(arr));

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int min = findMin(arr);
                    int max = findMax(arr);
                    System.out.println("Minimum value: " + min);
                    System.out.println("Maximum value: " + max);
                    break;
                case 2:
                    System.out.println("Differences from average:");
                    findAverage(arr);
                    break;
                case 3:
                    int oddSum = findOddSum(arr);
                    int evenSum = findEvenSum(arr);
                    System.out.println("Sum of elements at odd-numbered indexes: " + oddSum);
                    System.out.println("Sum of elements at even-numbered indexes: " + evenSum);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        // Close scanner
        scanner.close();
    }

    // Functions below
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

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
        System.out.println("1. Find minimum and maximum value.");
        System.out.println("2. Find the average and how each number differs from average.");
        System.out.println("3. Find the sum of elements with odd- and even-numbered indexes. ");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void findAverage(int[] arr) {
        int arrayTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            arrayTotal += arr[i];
        }
        int arrayAverage = arrayTotal / arr.length;
        System.out.println("Average: " + arrayAverage);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Difference for " + arr[i] + ": " + (arr[i] - arrayAverage));
        }
    }

    public static int findOddSum(int[] arr) {
        int oddSum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            oddSum += arr[i];
        }
        return oddSum;
    }

    public static int findEvenSum(int[] arr) {
        int evenSum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            evenSum += arr[i];
        }
        return evenSum;
    }
}
