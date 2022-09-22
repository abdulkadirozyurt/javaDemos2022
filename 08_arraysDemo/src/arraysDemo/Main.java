package arraysDemo;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Abdulkadir";
        ogrenciler[1]="Engin";
        ogrenciler[2]="Emirhan";
        ogrenciler[3]="Enes";
        
        for(int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }
        
        System.out.println("-------------");
        
        
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
        
        

    }

}
