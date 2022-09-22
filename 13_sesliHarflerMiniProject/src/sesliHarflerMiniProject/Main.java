package sesliHarflerMiniProject;

public class Main {

    public static void main(String[] args) {

        //sesliSessizHarf();
        
        
        //enginHoca();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }

    /**
     * 
     */
    public static void enginHoca() {
        char harf='A';
        
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli Harf");
                break;
                
            default:System.out.println("ince sesli harf");
            
               
                

            
        }
    }

    /**
     * 
     */
    public static void sesliSessizHarf() {
        char[] kalinSesli = {'a', 'ı', 'o', 'u'};
        char[] inceSesli = {'e', 'i', 'ö', 'ü'};
        char[] sessizHarfler = {'z', 'y', 'v', 't', 'ş', 's', 'r', 'p', 'n', 'r', 'm', 'l', 'k', 'h', 'j', 'ğ', 'g', 'd', 'ç', 'c', 'b'};

        char harf = 'ü';

        for (char character : kalinSesli) {
            if (harf == character) {
                System.out.println(harf + " harfi kalin sesli bir harftir.");

            }


        }

        for (char character : inceSesli) {
            if (harf == character) {
                System.out.println(harf + " harfi ince sesli bir harftir.");

            }


        }

        for (char character : sessizHarfler) {
            if (harf == character) {
                System.out.println(harf + " harfi sessiz bir harftir.");

            }


        }
    }
}
