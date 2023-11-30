import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

        System.out.println(convertDecimalToBinary(9));
        System.out.println(convertDecimalToBinary(10));
        System.out.println(convertDecimalToBinary(11));
        System.out.println(convertDecimalToBinary(15));
        System.out.println(convertDecimalToBinary(16));

    }

    public static boolean checkForPalindrome(String text) {
        String plainText = text.replaceAll("[.,?!'_-]", "").replaceAll(" ", "").toLowerCase(Locale.ENGLISH);

        //List<String> letters = new ArrayList<>(Arrays.asList(plainText.split("")));
        Queue<String> letters = new LinkedList<>(Arrays.asList(plainText.split("")));
        System.out.println(letters);
        Stack<String> lettersStack = new Stack<>();
        lettersStack.addAll(letters);
        System.out.println(lettersStack);
        for (String letter : letters) {
            if (!(letter.equals(lettersStack.pop()))) return false;
        }
        return true;
    }

    public static LinkedList<Integer> convertDecimalToBinary(int number) {
        Stack<Integer> remainderStack = new Stack<>();
        LinkedList<Integer> binary = new LinkedList<>();

        while (number > 0) {
            remainderStack.push( number % 2);
            number /= 2;
        }

        for (Integer integer : remainderStack) {
            binary.push(integer);
        }

        return binary;
    }
}