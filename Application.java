package com.Week5Assignment;

public class Application {

	public static void main(String[] args) {
		
		Logger astericLogger = new AsteriskLogger();
		
		astericLogger.log("Bye");
		astericLogger.error("Bye");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Bye");
		spacedLogger.error("Bye");
		
		
//		Logger logger = new FileLogger();
//		
//		logger.info("Hello");
//		logger.warning("The force is not enough");
//		logger.error("The force is not detected");
//		logger.fatal("The force is too strong!");
//		
//		logger.close();
//		
//		setLogger(new FileLogger());
//		setLogger(new ConsoleLogger())
//
//	}
//	private static void setLogger(Logger l) {
//		logger = l;
		
		
	
	}

}
