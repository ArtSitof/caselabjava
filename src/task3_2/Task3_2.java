package task3_2;

public class Task3_2 {
    public static void main(String[] args) {
        String palindrome1 = "Sagas b b sagaS";
        String palindrome2 = "string";

        System.out.println("First solution");
        isPalindromeFirstSolution(palindrome1);
        isPalindromeFirstSolution(palindrome2);

        System.out.println(" ");

        System.out.println("Second solution");
        isPalindromeSecondSolution(palindrome1);
        isPalindromeSecondSolution(palindrome2);
    }

    public static void isPalindromeFirstSolution(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (!(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(str.length() - 1 - i)))) {
                System.out.println("String \"" + str + "\" is not a palindrome");
                return;
            }
        }
        System.out.println("String \"" + str + "\" is a palindrome");
    }

    public static void isPalindromeSecondSolution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str.equalsIgnoreCase(stringBuilder.append(str).reverse().toString())) {
            System.out.println("String \"" + str + "\" is a palindrome");
        } else {
            System.out.println("String \"" + str + "\" is not a palindrome");
        }
    }
}
