package loopDemo;



public class Main {

    public static void main(String[] args) {
        //For
        
        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Dongusu bitti");
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        //while
        
        int i=1;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Dongusu bitti");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        //do-While: şart uymasa bile do kısmı çalışacak ve while'da şarta girecek ondan sonra duracaktır, farkı bu çünkü kod yukarıdan aşağı okunur.
        int j=1;
        do {
            System.out.println("Loglandi");            
            System.out.println(j);
            j++;
        } while (j<10);
        
        System.out.println("Do-While Dongusu bitti");
        
        
    }
    
    

}
