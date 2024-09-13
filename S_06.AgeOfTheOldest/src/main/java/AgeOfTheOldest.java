
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] words = input.split(",");

            if (maxAge < Integer.parseInt(words[1])) {
                maxAge = Integer.parseInt(words[1]);
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
    }
}
