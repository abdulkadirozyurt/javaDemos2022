
public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.id = 1;
        product1.name = "mouse";
        product1.price = 10;
        
        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();

    }

}
