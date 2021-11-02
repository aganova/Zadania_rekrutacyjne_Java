package Moje_zadania;

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
    }
}
