import java.text.DecimalFormat;
import java.math.*;

public class DecimalOperator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        DecimalFormat df = new DecimalFormat("###.###");
        df.setRoundingMode(RoundingMode.FLOOR);
        return (df.format(num1).equals(df.format(num2))) ? true : false;
    }
}
