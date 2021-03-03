package com.Week5Assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<log.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}
			result.append(log.charAt(i));
		}
		System.out.println(result.toString());
	}

	@Override
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<error.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}
			result.append(error.charAt(i));
		}
		System.out.println("ERROR: " + result.toString());
		
		
	}
	
//	private BufferedWriter writer;
//	public SpacedLogger() {
//		try {
//			writer = new BufferedWriter(new FileWriter("logs.txt"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void info(String info) {
//		Date date = new Date();
//		try {
//			writer.append("INFO: " + date.toString() + " - " + info);
//			writer.newLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Override
//	public void warning(String warning) {
//		Date date = new Date();
//		try {
//			writer.append("Warning: " + date.toString() + " - " + warning);
//			writer.newLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Override
//	public void error(String error) {
//		Date date = new Date();
//		try {
//			writer.append("error: " + date.toString() + " - " + error);
//			writer.newLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Override
//	public void fatal(String fatal) {
//		Date date = new Date();
//		try {
//			writer.append("fatal: " + date.toString() + " - " + fatal);
//			writer.newLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Override
//	public void close() {
//		try {
//			writer.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

}
