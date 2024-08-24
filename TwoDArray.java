
/*public class TwoDArray { // Renamed to TwoDArray for clarity

    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];

        // Variable declarations for loop counters
        int i, j, k;

        // Fill the array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }

        // Print the array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
*/
/* 
import java.util.Scanner;
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array as input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declaring the array
        int[] arr = new int[n];

        // Taking array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array without using a sorting method
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Compare and swap if the current element is greater than the next element
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));

        scanner.close();
    }
}
*/

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the scanner
        scanner.close();
    }
}
