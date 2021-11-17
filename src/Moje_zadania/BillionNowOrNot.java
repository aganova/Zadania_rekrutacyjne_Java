package Moje_zadania;

public class BillionNowOrNot {
    public static void countWhatIsBetter(boolean isBillionTakenNow) {
        int monthDays = 30;
        int startSum = 1; //one cent
        double result;

        if (isBillionTakenNow) {
                System.out.println("Bad choice! You have won only 1 million $!!");
                return;
        } else
            for (int i = 0; i < (monthDays - 1); i++) {
                startSum *= 2;
                startSum += 1;
            }
            result = (double) startSum / 100;
            System.out.printf("Congratulations! After 30 days you will get: %.2f $ (dollars)", result);
    }
}
