public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        while (num1 * num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;

            } else {
                num2 %= num1;
            }
        }
        return num1 + num2;
    }
}