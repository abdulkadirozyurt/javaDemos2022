
public class Main {

    public static void main(String[] args) {

        GameCalculater gameCalculater = new WomanGameCalculater();
        gameCalculater.hesapla();

        
        
        //abstractNewlenme();
        
        
        GameCalculater gameCalculater2 = new WomanGameCalculater();
        
        
    }

    
    
    
    
    public static void abstractNewlenme() {
        GameCalculater gameCalculater2 = new GameCalculater() {
            
            // abstract sınıflar asla newlenemez, newlenebilmesi için onun operasyonlarını bu şekilde override etmemiz gerekiyor. ama asla kullanılmayacak.
            
            @Override
            public void hesapla() {
                // TODO Auto-generated method stub
                
            }
        };
    }

}
