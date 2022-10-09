

public class CustomerManager {

    private BaseLogger logger;
    private String message;

    public CustomerManager(BaseLogger logger, String message) {

        this.logger = logger;
        this.message = message;
    }


    public void add() {


        System.out.println("Musteri Eklendi");
        this.logger.log(message);


        /*DatabaseLogger logger = new DatabaseLogger();
        logger.log("Log mesaji");
        bir class ı baska bir class icinde newlersek yandık.
        */


        ;
    }

}
