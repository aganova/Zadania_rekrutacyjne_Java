package PozostaleZadania;

public class Zadanie3 {
    //Mając dwie tablice napisz program, który utworzy trzecią, 2-elementową tablicę,
    //która będzie składała się z pierwszego elementu z pierwszej tablicy
    //i ostatniego elementu z drugiej tablicy

    public static void main(String[] args) {
        int[] tab = {7, 2, 3};
        int[] tab2 = {4, 5, 9};
        int[] tab3 = new int[2];

        tab3[0] = tab[0];
        tab3[1] = tab2[tab2.length-1];

        for (int element : tab3) {
            System.out.print(element + " ");
        }
    }

}
