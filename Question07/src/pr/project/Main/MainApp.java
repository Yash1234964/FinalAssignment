package pr.project.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainApp {
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Sorted array
	        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

	        System.out.print("Enter the target value: ");
	        int target = scanner.nextInt();

	        int result = binarySearch(array, target);

	        if (result != -1) {
	            System.out.println("Target value found at index: " + result);
	        } else {
	            System.out.println("Target value not found in the array.");
	        }
	    }
	  
	  public static int binarySearch(int[] array, int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid;
	            }

	            if (array[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1;
	    }
}
