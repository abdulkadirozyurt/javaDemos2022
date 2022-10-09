
public abstract class GameCalculater {

    public abstract  void hesapla(); // GameCalculater ı inherit eden sınıflar hesaplayı içermek zorunda fakat hesapla 'yı override etmek zorunda, yani kendi özelliğini kendisi vermek zorunda. içini doldurmayacaksak abstract metot olmalı

    public final void gameOver() {  // gameover ı kim kullanıyorsa olduğu gibi kullanmak zorunda dedik.
        System.out.println("Oyun Bitti.");
    }
}


// NOT: benim bir metodum var (birden fazla da olaiblir) onun içerisini base'de belirlemek istemiyorum ancak kim inherit ediyorsa override etmeli, kendi kodunu yazmalı, benim dediğim tek şey bu metodu içermesi, içini kendisi doldursun.'