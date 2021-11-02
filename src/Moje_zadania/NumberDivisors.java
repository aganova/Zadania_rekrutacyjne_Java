package Moje_zadania;

public class NumberDivisors {

    //Stwórz metodę dostępną w całym projekcie, która przyjmie jeden parametr całkowitoliczbowy i odpowie
    // ile jest liczb dodatnich będących dzielnikami tego parametru
    public static int countDivisors(int n) {
        if (n < 1) return 0;

        System.out.print("Liczba dzielników dla liczby " + n + " wynosi: ");
        int result = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) result++;
        }
        return result;
    }
}
