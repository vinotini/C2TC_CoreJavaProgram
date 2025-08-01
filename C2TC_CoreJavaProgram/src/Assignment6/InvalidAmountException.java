package Assignment6;

//Custom exception for invalid amounts in deposit or withdrawal
public class InvalidAmountException extends Exception {
public InvalidAmountException(String message) {
   super(message);
}
}
