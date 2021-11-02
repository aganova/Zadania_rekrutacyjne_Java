package Moje_zadania;

public class Demo {
    // 1. sposób
    public static void wyświetlTabliczkęMnożenia(int liczbaWierszyIkolumn) {
        System.out.println("----> Tabliczka mnożenia <----");

        for (int i = 1; i <= liczbaWierszyIkolumn; i++) {
            int number = i;
            for (int j = 1; j <= liczbaWierszyIkolumn; j++) {
                System.out.print(number + " ");
                number += i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        wyświetlTabliczkęMnożenia(10);
        System.out.println();

        // 2.sposób
        System.out.println("---> Tabliczka mnożenia nr 2 <-----");
        for (int i = 1; i <=10 ; i++) {
            int num = i;
            for (int j = 1; j <=10 ; j++) {
                num = i * j;
                System.out.print(num + " ");
            }
            System.out.println();
        }

        //wywołanie metody konwersji liczby dziesiętnych na liczby binarne
        //przekonwertujLiczbęDziesiętnąNaBinarną(23);

        System.out.println(countDivisors(10));

        fibonacciNumbers(20);
    }

    // konwersja liczba dzisiętnych na liczby binarne (0 - 1, oparte na systemi dwójkowym)
    //23 / 2 --> 11, reszty 1
    //11 / 2 -->  5, reszty 1
    // 5 / 2 -->  2, reszty 1
    // 2 / 2 -->  1, reszty 0
    // 1 / 2 -->  0, reszty 1

    public static void przekonwertujLiczbęDziesiętnąNaBinarną(int n) {
        if (n > 0) {
            System.out.println("Liczba dziesiętna " + n + " zapisana w systemie binarnym");
            przekonwertujLiczbęDziesiętnąNaBinarną(n/2); //wykorzystanie metody rekurencyjnej
            System.out.println("wywołanie metody dla n = " + n);
            System.out.println(n % 2);
        }
    }

    //Stwórz metodę dostępną w całym projekcie, która przyjmie jeden parametr całkowitoliczbowy i odpowie
    // ile jest liczb dodatnich będących dzielnikami tego parametru
    public static int countDivisors(int n) {
        if (n < 1) return 0;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) result++;
        }
        return result;
    }

    //Stwórz metodę publiczną zwracającą dla podanego parametru n
    // listę n pierwszych elementów ciągu Fibonacciego
    // 0 1 1 2 3 5 8 13 21
    public static void fibonacciNumbers(int n) {
        if (n < 1) System.err.println("Zadany parametr nie może być liczbą ujemną");

        int startNum = 0;
        int secondStartNum = 1;
        int[] fibonnacciNumbers = new int[n];
        fibonnacciNumbers[0] = startNum;
        fibonnacciNumbers[1] = secondStartNum;

        for (int i = 2; i < n ; i++) {
            fibonnacciNumbers[i] = fibonnacciNumbers[i-2] + fibonnacciNumbers[i-1];
        }

        System.out.println("Pierwsze "+ n + " liczb ciągu fibbonacciego to: ");
        for (int num : fibonnacciNumbers) {
            System.out.print(num + " ");
        }
    }
}
