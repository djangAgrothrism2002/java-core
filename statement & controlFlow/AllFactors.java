public class AllFactors {
    public static void printFactor(int num) {
        if (num >= 0) {
            for (int i = 0; i < num; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        AllFactors test = new AllFactors();
        test.printFactor(5);
        // printFactor(0);
    }

}