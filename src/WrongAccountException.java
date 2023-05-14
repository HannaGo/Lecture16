public class WrongAccountException extends Exception{
    public WrongAccountException(String message) {
        super(message);
        System.out.println(message);
    }
}
