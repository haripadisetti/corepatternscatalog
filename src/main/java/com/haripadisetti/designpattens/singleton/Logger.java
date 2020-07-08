package com.haripadisetti.designpattens.singleton;

public class Logger {

	private static Logger instance;  // early singleton if here,instance = new Logger();

	//static block singleton
	//static { instance = new Logger(); }
	
	private Logger() {
	}

	public static Logger getInstance() {
		
		//if(instance == null) {  //double check singleton -start
		//synchrozied(Logger.class){  //multithreaded application -start
		if (instance == null) {     //lazy singleton 
			instance = new Logger();
		}
		//}//multithreaded application - end
		//}//double check singleton -end
		return instance;
	}

	protected void print(String message) {
		System.out.println(message);
	}

}
