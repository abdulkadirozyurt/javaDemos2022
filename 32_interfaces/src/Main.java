
public class Main {

    public static void main(String[] args) {

        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();

        System.out.println("-------------------------------");


        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
        


        
    }

}
