package PozostaleZadania;

public class Zadanie5 {
    // Napisz program, który zmieni pierwszy i ostatni element w tablicy
    // tab1: [1, 3, 5, 4]
    // wynik: [4, 3, 5, 1]

    public static void main(String[] args) {
        int[] tab = {7, 3, 5, 4, 10, 25, 32};
        int[] newTab = new int[tab.length];

        newTab[0] = tab[tab.length - 1];
        newTab[tab.length - 1] = tab[0];

        for (int i = 1; i < tab.length - 1; i++) {
            newTab[i] = tab[i];
        }

        System.out.println("Wynik: ");
        for (int number : newTab) {
            System.out.print(number + " ");
        }


    }
}
