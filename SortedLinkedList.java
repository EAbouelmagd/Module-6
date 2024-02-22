//java SortedLinkedList.java <---USE TO RUN IN CMD
import java.util.*;

/**
 * This program reads a list of Integer numbers from the user and
 * saves them into a Linked List sorted in ascending order.
 */
public class SortedLinkedList {

    /**
     * Reads a list of Integer numbers from the user and
     * saves them into a Linked List sorted in ascending order.
     *
     * @param args the command-line arguments 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of Integer numbers (separated by comma): ");
        String input = scanner.nextLine();
        List<Integer> numbers = parseInput(input);

        LinkedList<Integer> sortedList = new LinkedList<>(numbers);
        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList);
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
