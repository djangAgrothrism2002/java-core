
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 2, 3, 4, 5, 6, 7 }, { 1, 2, 3, 4, 5, 6 } };
        for (int[] x : matrix) {
            for (int i : x) {
                System.out.println(i);
            }
        }
    }
}
