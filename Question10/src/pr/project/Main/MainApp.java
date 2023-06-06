package pr.project.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        System.out.println("Enter the integers:");

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        int secondLargest = findSecondLargest(numbers);
        int secondSmallest = findSecondSmallest(numbers);

        System.out.println("Second largest number: " + secondLargest);
        System.out.println("Second smallest number: " + secondSmallest);
    }

    public static int findSecondLargest(List<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Insufficient elements in the list.");
        }

        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);

        return sortedList.get(numbers.size() - 2);
    }

    public static int findSecondSmallest(List<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Insufficient elements in the list.");
        }

        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);

        return sortedList.get(1);
    }
}
