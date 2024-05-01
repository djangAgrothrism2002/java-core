
public class TribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacciTest(4));
    }

    public static int tribonacciTest(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        int[] numTribo = new int[num + 1];
        numTribo[0] = 0;
        numTribo[1] = 1;
        numTribo[2] = 1;
        for (int i = 3; i <= num; i++) {
            numTribo[i] = numTribo[i - 1] + numTribo[i - 2] + numTribo[i - 3];
        }
        return numTribo[num];
    }
}
