
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = 0;
        int entries = 0;
        StringBuilder longestName = new StringBuilder();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            entries++;
            String[] words = input.split(",");
            years += Integer.parseInt(words[1]);

            if (longestName.length() < words[0].length()) {
                longestName.replace(0, longestName.length(), words[0]);
            }

        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) years / entries);
    }
}
