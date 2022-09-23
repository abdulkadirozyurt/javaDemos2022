
public class ProductManager {

    // single responsibility principle : bir class,bir metot sadece bir işi yapar. bir if bloğu sadece bir işi yapar. 
    
    public void Add(Product product) {
        
        System.out.println("Product Added: " + product.name);

    }
}
