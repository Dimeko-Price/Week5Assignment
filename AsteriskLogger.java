package com.Week5Assignment;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	
	@Override
	public void error(String error) {
		System.out.println("******************" + "\n" + "***Error: " + error + "***"
				+ "\n" + "******************");
		
	}

//	@Override
//	public void info(String info) {
//		Date date = new Date();
//		System.out.println(date.toString() + ": " + info);
//		
//	}
//
//	@Override
//	public void warning(String warning) {
//		Date date = new Date();
//		System.out.println(date.toString() + ": " + "Warning - "  + warning);
//		
//	}
//
//	@Override
//	public void error(String error) {
//		Date date = new Date();
//		System.err.println(date.toString() + ": " + "Error - "   + error);
//		
//	}
//
//	@Override
//	public void fatal(String fatal) {
//		Date date = new Date();
//		System.err.println(date.toString() + ": " + "FATAL!!!! " +  fatal.toUpperCase());
//		
//	}
//
//	@Override
//	public void close() {
//		
//		
//	}

}
