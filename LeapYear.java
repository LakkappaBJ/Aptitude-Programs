class LeapYear{
	public static void main(String []args){
		
		int year=2021;
		if(year%4==0){
			System.out.println("Specified year is a Leap Year.");
		}
		else if(year%400==0){
			System.out.println("It is a Leap Year");
		}
		else if(year%100==0){
			System.out.println("It is a Leap Year....");
		}
		else{
			System.out.println("Specified year not Leap Year!!!!");
		}
		}

}