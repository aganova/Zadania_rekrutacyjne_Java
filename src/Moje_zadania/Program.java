package Moje_zadania;

import static Moje_zadania.ZadanieOdPawlaJasko.getSumNumber;

public class Program {

    public static void main(String[] args) {
        TabliczkaMnozenia.wyświetlTabliczkeMnozenia(10);
        System.out.println();

        TabliczkaMnozenia.wyświetlTabliczkeMnozenia2(10);
        System.out.println();

        NumberConversion.convertDecimalNumberIntoBinar(23);
        System.out.println();

        System.out.println(NumberDivisors.countDivisors(10));
        System.out.println();

        FibonacciSequence.fibonacciNumbers(20);
        System.out.println();
        System.out.println();

        BillionNowOrNot.countWhatIsBetter(false);

        getSumNumber(3);
    }
}
