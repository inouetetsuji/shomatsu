package check;

import constants.Constants;

public class Check {

		private static String firstName="徹治";
	    private static String lastName="井上";
		public static String getMasteName;
		public static String getName;	
	    
	public static void main(String[] args) { 		
	
			Pet pet1 = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
			pet1.introduce();
	
		RobotPet pet2 = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		pet2.introduce();			
		
		printName(firstName,lastName);		
	}
	private static void printName(String firstName2, String lastName2) {
	        System.out.println("printNameメソッド→"+lastName2+firstName2);
	}
		
	}     
	




	
