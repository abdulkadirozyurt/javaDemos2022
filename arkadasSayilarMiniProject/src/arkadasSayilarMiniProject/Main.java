package arkadasSayilarMiniProject;

public class Main {

    public static void main(String[] args) {
        // kendileri hariç pozitif tam bölenlerinin toplamı birbirlerinin degerine eşit sayilardir

        //220 284 gibi

        int sayi1 = 18416;
        int sayi2 = 17296;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }

        for (int j = 1; j < sayi2; j++) {
            if (sayi2 % j == 0) {
                toplam2 += j;
            }
        }

        if (toplam1 == 17296 && toplam2 == 18416) {
            System.out.println(sayi1 + " ve " + sayi2 + " sayilari arkadas sayilardir");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " sayilari arkadas sayi degildir");
        }


    }

}
