package Assignment6;

//Custom exception for insufficient funds during withdrawal
public class InsufficientFundsException extends Exception {
public InsufficientFundsException(String message) {
   super(message);
}
}