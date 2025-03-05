import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Convert to lowercase for easy comparison
        input = input.toLowerCase();

        int vowels = 0, consonants = 0, numbers = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers++; // Count numbers
            } else if ("aeiou".indexOf(ch) != -1) {
                vowels++; // Count vowels
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++; // Count consonants
            }
        }

        // Display results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Numbers: " + numbers);
    }
}
