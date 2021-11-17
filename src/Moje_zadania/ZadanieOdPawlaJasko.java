package Moje_zadania;

public class ZadanieOdPawlaJasko {

    public static void getSumNumber(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println();
        System.out.println("Suma liczb dla zadanego parametru " + number + " jest równa " + sum);
    }
}