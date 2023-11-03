package arraydisplaying;

//import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] userArray = new int[size];

        // Prompt the user to enter values for the array
        System.out.println("Enter " + size + " values for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

        // Display the values of the array
        System.out.println("Values in the array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Value " + (i + 1) + ": " + userArray[i]);
        }

        // Sort the array
//        Arrays.sort(userArray);
//        System.out.println("Sorted array: " + Arrays.toString(userArray));

        // Ask the user for the position to add a new element, ensuring it's within the range of the array
        int newPosition;
        do {
            System.out.print("Enter a position to add a new element (1 to " + (size + 1) + "): ");
            newPosition = scanner.nextInt();
            if (newPosition < 1 || newPosition > size + 1) {
                System.out.println("Incorrect position. Please enter a position within the range of the array.");
            }
        } while (newPosition < 1 || newPosition > size + 1);

        // Ask the user to enter the new element
        System.out.print("Enter the new element: ");
        int newElement = scanner.nextInt();

        // Create a new array with the new element at the adjusted position
        int[] newArray = new int[size + 1];
        for (int i = 0, j = 0; i < size + 1; i++) {
            if (i == newPosition - 1) {
                newArray[i] = newElement;
            } else {
                newArray[i] = userArray[j];
                j++;
            }
        }

        // Display the final array with the new element
        System.out.println("Final array with the new element: " + Arrays.toString(newArray));

        // Close the scanner
        scanner.close();
    }
}

