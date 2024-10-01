package designPattern.chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		/*
		 * When client send the reuest we are not sure which reciever will process that request.
		 */
		
		LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		
		logObj.log(LogProcessor.INFO, "Info level log");
		logObj.log(LogProcessor.ERROR, "Exception occur");
		logObj.log(LogProcessor.DEBUG, "Needs to Debug");
	}

}
