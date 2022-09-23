
public class Main {

    public static void main(String[] args) {


        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Laptop";
        product1.description = "Asus Laptop";
        product1.price = 5000;
        product1.stockAmount = 3;
        product1.renk = "siyah";


        ProductManager productManager = new ProductManager();
        productManager.Add(product1);

        productManager.Add2(1, "laptop", "Asus", 5, 5000);
        productManager.Add2(1, "laptop", "Asus", 5, 5000);
        productManager.Add2(1, "laptop", "Asus", 5, 5000);
        productManager.Add2(1, "laptop", "Asus", 5, 5000);
        productManager.Add2(1, "laptop", "Asus", 5, 5000);

    }

}
