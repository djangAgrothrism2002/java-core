
public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int num) {
        if (num > 0) {
            int sum = 0;
            String convertString = Integer.toString(num);
            for (int i = 0; i < convertString.length(); i++) {
                int number = convertString.charAt(i) - '0';
                if (number % 2 == 0) {
                    sum += number;
                }
            }
            return sum;
        }
        return -1;
    }
}