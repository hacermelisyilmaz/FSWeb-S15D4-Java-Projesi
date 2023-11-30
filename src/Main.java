import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        String plainText = text.replaceAll("[.,?!'_-]", "").replaceAll(" ", "").toLowerCase(Locale.ENGLISH);

        //List<String> letters = new ArrayList<>(Arrays.asList(plainText.split("")));
        Queue<String> letters = new LinkedList<>(Arrays.asList(plainText.split("")));

        Stack<String> lettersStack = new Stack<>();
        lettersStack.addAll(letters);

        for (String letter : letters) {
            if (!(letter.equals(lettersStack.pop()))) return false;
        }
        return true;
    }
}