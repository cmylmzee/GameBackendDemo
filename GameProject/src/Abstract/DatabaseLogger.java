package Abstract;

public class DatabaseLogger implements LogService {

	@Override
	public void log(String message) {
		System.out.println("Logged to DB. Log message is : " + message);
		
	}

}
