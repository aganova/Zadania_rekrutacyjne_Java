package Moje_zadania;

public class NumberConversion {

    // konwersja liczb dzisiętnych na liczby binarne (0 - 1, oparte na systemie dwójkowym)
    //23 / 2 --> 11, reszty 1
    //11 / 2 -->  5, reszty 1
    // 5 / 2 -->  2, reszty 1
    // 2 / 2 -->  1, reszty 0
    // 1 / 2 -->  0, reszty 1

    public static void convertDecimalNumberIntoBinar(int n) {
        if (n > 0) {
            System.out.println("Liczba dziesiętna " + n + " zapisana w systemie binarnym");
            convertDecimalNumberIntoBinar(n/2); //wykorzystanie metody rekurencyjnej
            System.out.println("wywołanie metody dla n = " + n);
            System.out.println(n % 2);
        }
    }
}
