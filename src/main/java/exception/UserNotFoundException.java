package exception;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(int airport_code){
        super("Could not found the airport with airport_code "+ airport_code);
    }
}
