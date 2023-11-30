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

        Stack<String> lettersStack = new Stack<>();
        lettersStack.addAll(letters);

        for (String letter : letters) {
            if (!(letter.equals(lettersStack.pop()))) return false;
        }
        return true;
    }

    public static String convertDecimalToBinary(int number) {
        Map<Integer, Integer> binaryMap = new HashMap<>();

        for (int i = 8; i >= 0; i--) {
            binaryMap.put(i, 0);

            if (number >= Math.pow(2, i)) {
                number -= (int) Math.pow(2, i);
                binaryMap.put(i, 1);
            }
        }

        System.out.println(binaryMap);
        return "";
    }
}