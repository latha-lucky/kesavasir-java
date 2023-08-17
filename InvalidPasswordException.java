package example;

class InvalidPasswordException extends RuntimeException{
	private String message;
	 InvalidPasswordException(String message){
		 this.message=message;
	 }
	 public String getMessage() {
		 return message;
	 }
	

}
