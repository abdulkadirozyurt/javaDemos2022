import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        //double[] myList = new double[4];

        // demoMaxAndTotal();


        double[] sayilar = {1.85, 70.97, 83.38, 94.81};
        double total = 0;
        double max = sayilar[0];


        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("***********************************");

        for (double sayi : sayilar) {
            total += sayi;
        }
        System.out.println("Toplam = " + total);

        System.out.println("***********************************");

        for (double sayi : sayilar) {
            if (max < sayi) {
                max = sayi;
            }
        }
        System.out.println("Max = " + max);


    }


    public static void demoMaxAndTotal() {
        double[] myList = {1.1, 1.2, 1.5, 1.7};

        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);

        System.out.println("---------------------------------");

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("max number= " + max);
    }

}
