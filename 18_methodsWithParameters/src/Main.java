
public class Main {

    public static void main(String[] args) {

        int toplam = topla(585, 963457);
        System.out.println(toplam);
    }


    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Guncellendi");
    }


    public static int topla(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        return toplam;

    }

}
