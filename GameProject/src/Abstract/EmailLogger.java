package Abstract;

public class EmailLogger implements LogService {

	@Override
	public void log(String message) {
		System.out.println("Mail is sent. Log message is : " + message);
		
	}

}
