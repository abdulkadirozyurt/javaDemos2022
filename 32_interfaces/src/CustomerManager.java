
public class CustomerManager {

    private ICustomerDal _customerDal;

    public CustomerManager(ICustomerDal customerDal) {

        _customerDal = customerDal;
    }


    public void add() {
        // iş kodları yazılır, burası dal katmanını çağırır.

        _customerDal.add();

    }

}
