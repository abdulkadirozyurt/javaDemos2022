package miniProjectAsalSayi;



public class Main {

    public static void main(String[] args) {

        int number = 0;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("1 sayisi asal degildir");
            return;
        }

        if (number < 1) {
            System.out.println("Gecersiz sayi!!!!!");
            return; // return, bulundugumuz main fonksiyonunu direkt olarak bitirir, alttaki kodlara geçilmez.
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " sayisi asaldir.");
        } else {
            System.out.println(number + " sayisi asal degildir.");
        }


    }

}
