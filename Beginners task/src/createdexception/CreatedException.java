package createdexception;

public class CreatedException extends Exception{
	
	public CreatedException(String message){
		super(message);
	}
	
	public CreatedException(String message,Exception e){
		super(message,e);
	}
}
