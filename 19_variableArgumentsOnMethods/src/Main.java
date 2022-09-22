
public class Main {

    public static void main(String[] args) {

        int toplam = topla(1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 6, 3, 5, 2, 3, 3, 3, 3, 2, 2, 5, 5, 6, 4, 9, 8, 7, 56456, 325, 5);
        System.out.println(toplam);
    }

    public static int topla(int... sayilar) {
        //  (...) variable arguments anlamina geliyor

        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}
