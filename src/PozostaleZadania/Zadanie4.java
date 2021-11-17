package PozostaleZadania;

public class Zadanie4 {
    //Napisz program, który pomnoży odpowiadające sobie elementy dwóch tablic.
    //Obie tablice są tej samej długości.
    //tab1: [1, 3, 5, 4]
    //tab2: [1, 4, 5, 2]
    //Wynik: 1 12 25 8

    public static void main(String[] args) {
        int[] tab1 = {1, 3, 5, 4};
        int[] tab2 = {1, 4, 5, 2};
        int[] tab3 = new int[4];

        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i] * tab2[i];
        }

        System.out.println("Wynik: ");
        for (int element : tab3) {
            System.out.print(element + " ");
        }

    }

}
