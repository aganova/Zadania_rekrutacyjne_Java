package PozostaleZadania;

public class Zadanie2 {
    //Mając dwie tablice zawierające liczby całkowite, napisz program, który sprawdzi
    //czy pierwszy i ostatni element z pierwszej tablicy są takie same
    //jak pierwszy i ostatni element z drugiej tablicy

    public static void main(String[] args) {
        int[] tab = {0, 2, 3};
        int[] tab2 = {1, 2, 3};
        if (tab[0] == tab2[0] && tab[tab.length - 1] == tab2[tab.length - 1])
            System.out.println("Pierwsze i ostatnie elementy tablic są takie same");
        else
            System.out.println("Pierwsze i ostatnie elementy tablic NIE SĄ takie same");

    }



}
