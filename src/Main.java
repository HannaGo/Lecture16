public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId0000", 50, "USD");
        }catch (WrongAccountException WrongAccountException){
            System.out.println("Please check account id.");
        }catch (WrongCurrencyException WrongCurrencyException){
            System.out.println("Please check account currency.");
        }catch (WrongOperationException WrongOperationException){
            System.out.println("Please check the operation.");
        }finally{
            System.out.println("Thank you!");
        }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        }catch (WrongAccountException WrongAccountException){
            System.out.println("Please check account id.");
        }catch (WrongCurrencyException WrongCurrencyException){
            System.out.println("Please check account currency.");
        }catch (WrongOperationException WrongOperationException){
            System.out.println("Please check the operation.");
        }finally{
            System.out.println("Thank you!");
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        }catch (WrongAccountException WrongAccountException){
            System.out.println("Please check account id.");
        }catch (WrongCurrencyException WrongCurrencyException){
            System.out.println("Please check account currency.");
        }catch (WrongOperationException WrongOperationException){
            System.out.println("Please check the operation.");
        }finally{
            System.out.println("Thank you!");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        }catch (WrongAccountException WrongAccountException){
            System.out.println("Please check account id.");
        }catch (WrongCurrencyException WrongCurrencyException){
            System.out.println("Please check account currency.");
        }catch (WrongOperationException WrongOperationException){
            System.out.println("Please check the operation.");
        }finally{
            System.out.println("Thank you!");
        }


    }
}
