package check;



public class Check {

		private static String firstName="徹治";
	    private static String lastName="井上";
		public static String getMasteName;
		public static String getName;	
	    
	    public String getfirstName() {
	    	return this.firstName;
	    }
	    public String getlastName() {
	    	return this.lastName;
	    }
	public static void main(String[] args) { 

			System.out.println("printNameメソッド→"+lastName+firstName) ;
			} 
	private static void printName(String firstName2, String lastName2, String getMasterName) {
	
	
	
	Pet pet1 = new Pet(getName, getMasterName);
	pet1.introduce();

	RobotPet pet2 = new RobotPet(getName, getMasterName);
	pet2.introduce();
	}

}

	
