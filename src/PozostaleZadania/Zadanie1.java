package PozostaleZadania;

public class Zadanie1 {
    //Napisz program, który sprawdzi czy pierwszy i ostatni element
    //w tablicy zawierającej liczby całkowite są takie same.
    //tab = [1, 2, 4, 1] - true
    //tab = [1, 2, 4, 5] - false

    public static void main(String[] args) {
        int[] tab = {1, 2, 4, 1};

            if (tab[0] == tab[tab.length - 1]) {
                System.out.println("Pierwszy i ostatni element tablicy są równe: " + true);
            } else
                System.out.println("Pierwszy i ostatni element tablicy są równe: " + false);
     }
}
