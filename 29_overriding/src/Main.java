
public class Main {
    
    public static void main(String[] args) {
        
        BaseCreditManager[] creditManagers = new BaseCreditManager[] {
                
                new OgretmenCreditManager(),
                new TarimKrediManager(),
                new OgrenciKrediManager()
        };
        
        for (BaseCreditManager krediManager : creditManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
        
    }
    
    
    
    
}
