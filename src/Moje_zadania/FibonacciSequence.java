package Moje_zadania;

public class FibonacciSequence {

    //Stwórz metodę publiczną zwracającą dla podanego parametru n
    // listę n pierwszych elementów ciągu Fibonacciego
    // 0 1 1 2 3 5 8 13 21

    public static void fibonacciNumbers(int n) {
        if (n < 1) System.err.println("Zadany parametr nie może być liczbą ujemną");

        int startNum = 0;
        int secondStartNum = 1;
        int[] fibonacciNumbers = new int[n];
        fibonacciNumbers[0] = startNum;
        fibonacciNumbers[1] = secondStartNum;

        for (int i = 2; i < n ; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-2] + fibonacciNumbers[i-1];
        }

        System.out.println("Pierwsze "+ n + " liczb ciągu fibbonacciego to: ");
        for (int num : fibonacciNumbers) {
            System.out.print(num + " ");
        }
    }
}
