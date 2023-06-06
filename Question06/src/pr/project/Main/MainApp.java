package pr.project.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
	  public static void main(String[] args) {
	        // Sample data set
	        List<Integer> numbers = Arrays.asList(5, 3, 10, 8, 2, 7, 6, 1, 4, 9);

	        // Sorting the data
	        List<Integer> sortedNumbers = numbers.stream()
	                .sorted()
	                .collect(Collectors.toList());

	        System.out.println("Sorted numbers: " + sortedNumbers);

	        // Filtering the data
	        List<Integer> filteredNumbers = numbers.stream()
	                .filter(n -> n % 2 == 0)
	                .collect(Collectors.toList());

	        System.out.println("Filtered numbers (even): " + filteredNumbers);
	    }
}
