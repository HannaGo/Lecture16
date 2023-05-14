public class WrongOperationException extends Exception{
    public WrongOperationException(String message) {
        super(message);
        System.out.println(message);
    }
}
