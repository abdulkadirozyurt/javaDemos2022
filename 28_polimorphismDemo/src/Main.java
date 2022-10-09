public class Main {

    public static void main(String[] args) {
        
        BaseLogger[] loggers = new BaseLogger[] {new ConsoleLogger(),new FileLogger(),new EmailLogger(),new DatabaseLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("a");
        }
        
        
        System.out.println("-----------------------------------------------");
        
        
        CustomerManager customerManager = new CustomerManager(new FileLogger(),"log succeed");
        customerManager.add();
    }

}
