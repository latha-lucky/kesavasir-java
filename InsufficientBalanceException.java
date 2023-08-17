package example;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	
	InsufficientBalanceException(String message){
		this.message=message;
	}
	
	

}
