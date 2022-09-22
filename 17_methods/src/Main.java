
public class Main {

    public static void main(String[] args) {

        sayiBulmaca(50);

    }


    public static void sayiBulmaca(int aranacakSayi) {

        int[] sayilar = new int[]{1, 2, 5, 7, 17, 9, 0};

        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacakSayi) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            MesajVer(aranacakSayi + " sayisi, sayilar'da mevcuttur.");
        } else {
            MesajVer(aranacakSayi + " sayisi, sayilar'da mevcut degildir.");
        }
    }

    public static void MesajVer(String mesaj) {
        System.out.println(mesaj);

    }

    /*
     * public static void olumsuzMesajVer(int aranacakSayi) {
        System.out.println(aranacakSayi + " sayisi, sayilar'da mevcut degildir.");
    
    }
    */

}
