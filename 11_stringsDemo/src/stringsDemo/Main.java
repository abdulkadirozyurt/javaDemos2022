package stringsDemo;

public class Main {

    public static void main(String[] args) {
        String mesaj = "     Bugun hava cok guzel.     ";


        /*
        
         
         
        System.out.println(mesaj.length());
        System.out.println("5. eleman: " + mesaj.charAt(4));
        
        System.out.println(mesaj.concat(" Yasasin!"));
        
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("C"));
        
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        
        System.out.println(karakterler);
        
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e'));
        
        
        */

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2));  // 2. indexten itibaren mesajı alır.
        
        System.out.println(mesaj.substring(2,4)); //2. indexten 4. indexe kadar alır(4 dahil değil)
        
        
        // split, bir metni belli bir karakter veya karakter dizisini dikkate alarak parçalamaya yarar
        
        for (String kelime : mesaj.split(" ")) {
            
            System.out.println(kelime);
        }
        
        
        
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        
        
        
        System.out.println(mesaj.trim());
        
        
    }

}
