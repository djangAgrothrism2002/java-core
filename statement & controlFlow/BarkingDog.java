public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 2));
    }

    public static boolean shouldWakeUp(boolean bark, int hour) {
        if (bark = true && hour <= 22 || hour >= 8) {
            return true;
        } else {
            return false;
        }
    }
}