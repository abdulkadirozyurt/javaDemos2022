

// ürünü kaydederken güncellerken kurallara uygun olup olmadığını doğrulamak için kullanırız

public class ProductValidator {

    static {
        // static yapıcı blok
        // static metodu çağırınca çalışsın diye.
        System.out.println("Static yapici blok calisti");
    }


    public ProductValidator() {
        System.out.println("yapici blok calisti");
    }

    // bu şekilde araç (utility) olarak yapacğaımız şeylerde static kullanırsak      
    // static yapınca classı newlemeden metodunu kullanabiliriz.
    // static olarak nesne oluşur, program sıfırlanana kadar bellekte tutulur, bu yüzden class'ları static yapmayız.
    // ilk çağıran kullanıcı nesneyi oluşturur, diğer tüm kullanıcılar onu çağırır static olunca


    public static boolean isValid(Product product) {

        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void biseyYap() {

    }


    public static class BaskaBirClass {

        // ana class(ProductValidator) static olamaz ancak inner class static yapılabilir.
        public static void sil() {

        }
    }


}
