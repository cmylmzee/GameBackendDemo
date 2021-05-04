package Concrete;

import Abstract.DatabaseLogger;
import Abstract.EmailLogger;
import Abstract.LogService;

public class MultiplyLogger  {
	private static LogService[] logServices = {new DatabaseLogger(), new EmailLogger()};
	
	public static void MultiplyLog(String message) {
		for(LogService logservice: logServices) {
		logservice.log(message);
		}
	}
	
}
