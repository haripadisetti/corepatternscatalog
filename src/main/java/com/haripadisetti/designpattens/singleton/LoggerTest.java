package com.haripadisetti.designpattens.singleton;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = Logger.getInstance();
		logger.print("Singleton is awesome !!");
		
		Logger logger2 = Logger.getInstance();
			
		System.out.println(logger == logger2);
	}

}
