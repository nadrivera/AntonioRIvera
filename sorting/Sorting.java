package sorting;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int temp;
        double mean, sum = 0;    
       
        System.out.print("Enter size of Array: ");

        int input = scan.nextInt();
        int numbers[] = new int[input];

        for (int x = 0; x < input; x++) {
            System.out.print("Enter Element " + x + ": ");
            numbers[x] = scan.nextInt();
            sum = sum += numbers[x];
        }

        System.out.print("Unsorted Array: ");
        for (int x = 0; x < input; x++) {
            System.out.print(numbers[x] + " ");
        }

        for (int x = 0; x < input; x++) {
            for (int j = 0; j < input; j++) {
                if (numbers[x] < numbers[j]) {
                    temp = numbers[x];
                    numbers[x] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }

        System.out.print("\nSorted Array: ");
        for (int x = 0; x < input; x++) {
            System.out.print(numbers[x] + " ");
        }

        mean = sum / numbers.length;
        System.out.println("\nMean: " + mean);

    }
}
