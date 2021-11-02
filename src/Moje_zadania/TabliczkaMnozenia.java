package Moje_zadania;

public class TabliczkaMnozenia {

    // 1. sposób
    public static void wyświetlTabliczkeMnozenia(int liczbaWierszyIkolumn) {
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


    // 2.sposób
    public static void wyświetlTabliczkeMnozenia2(int pliczbaWierszyIkolumn) {
        System.out.println("---> Tabliczka mnożenia nr 2 <-----");
        for (int i = 1; i <=10 ; i++) {
            int num = i;
            for (int j = 1; j <=10 ; j++) {
                num = i * j;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
