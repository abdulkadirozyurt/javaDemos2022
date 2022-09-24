
public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();


        // constructor with parameter

        Product product1 = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "siyah");

        System.out.println(product1.getCode());
        productManager.Add(product1);


        // constructor without parameter

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Cep Telefonu");
        product2.setDescription("Samsung Cep Telefonu");
        product2.setPrice(7000);
        product2.setStockAmount(7);

        System.out.println(product2.getCode());
        productManager.Add(product2);


    }

}
