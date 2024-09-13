
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = 0;
        StringBuilder name = new StringBuilder();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] words = input.split(",");

            if (maxAge < Integer.parseInt(words[1])) {
                maxAge = Integer.parseInt(words[1]);
                name.replace(0, name.length(), words[0]);
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
