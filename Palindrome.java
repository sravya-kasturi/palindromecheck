import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if input is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
            scanner.close();
        }
    }

    /** */
     * Checks if a string is a palindrome.
     * 
     * @param str the string to check
     * @return true if str is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

