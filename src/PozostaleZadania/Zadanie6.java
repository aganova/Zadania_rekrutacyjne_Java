package PozostaleZadania;

public class Zadanie6 {
    // Napisz program, który przesunie wszystkie elementy tablicy o jedno miejsce  w lewo.
    // Tablica składa się z liczb całkowitych. Rozmiar tablicy = 3;
    // tab: [20, 30, 40]
    // Wynik: [30, 40, 20]

    public static void main(String[] args) {
        int[] tab = {20, 30, 40, 50, 60, 70, 10};
        int[] newTab = new int[tab.length];

        // 1.sposób
        //for (int i = 0; i < tab.length; i++) {
        //    if (i == 0 || i != tab.length - 1)
        //        newTab[i] = tab[i + 1];
        //    else
        //        newTab[i] = tab[0];
        //}

        // 2.sposób
        for (int i = 0; i < tab.length; i++) {
            
        }

        System.out.println("Wynik: ");
        for (int numb : newTab) {
            System.out.print(numb + " ");

        }
    }
}
