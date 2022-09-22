package sayiBulma;

public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7,17, 9, 0};

        int aranacakSayi = 17;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi==aranacakSayi) {
                varMi=true;
                break;
            }
        }
        
        if (varMi) {
            System.out.println(aranacakSayi+" sayisi, sayilar'da mevcuttur.");
        }
        else {
            System.out.println(aranacakSayi+" sayisi, sayilar'da mevcut degildir.");
        }
        


    }

}
