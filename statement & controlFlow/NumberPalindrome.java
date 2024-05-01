
public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(252));
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return originalNum == reversed;
    }
}