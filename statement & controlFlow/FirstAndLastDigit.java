
public class FirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num > 0) {
            int sum = 0;
            String convertString = Integer.toString(num);
            int firstNum = convertString.charAt(0) - '0';
            int lastNum = convertString.charAt(convertString.length() - 1) - '0';
            sum = firstNum + lastNum;
            return sum;
        }
        return -1;
    }
}