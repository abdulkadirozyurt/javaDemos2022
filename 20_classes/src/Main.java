
public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager;


        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        
        System.out.println("---------------------------------------------");

        // value type 
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        
        System.out.println("---------------------------------------------");
        
        
        // iki farklı dizi tanımlama şekli, ikisi de aynı anlama geliyor.
        // reference type
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = {4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
        
    }


}

