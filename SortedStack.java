//java SortedStack.java <---USE TO RUN IN CMD

//Importing java utility package
import java.util.*;

/**
 * This program reads a list of Integer numbers from the user and
 * saves them into a Stack sorted in ascending order using the collections.sort.
 */
public class SortedStack {

    /**
     * Reads a list of Integer numbers from the user and
     * saves them into a Stack sorted in ascending order.
     *
     * @param args the command-line arguments 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of Integer numbers (separated by comma): ");
        String input = scanner.nextLine();
        List<Integer> numbers = parseInput(input);

        Stack<Integer> sortedStack = new Stack<>();
        // Add all elements to the stack
        sortedStack.addAll(numbers); 
        // Sort the stack
        Collections.sort(sortedStack); 
        System.out.println("Sorted Stack: " + sortedStack);
    }

    /**
     * Parses the user input and returns a List of Integer numbers.
     *
     * @param input the user input containing numbers separated by comma
     * @return a List of Integer numbers extracted from the input
     */
    public static List<Integer> parseInput(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] tokens = input.split(",");
        for (String token : tokens) {
            try {
                int number = Integer.parseInt(token.trim());
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + token);
            }
        }
        return numbers;
    }
}
