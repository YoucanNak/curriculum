package check;

import constants.Constants;

public class Main {
	private static String firstName;
	private static String lastName;
	public static void main(String[] args) {
		firstName = "湧希";
		lastName = "中野";
		printName(firstName, lastName);
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		pet.introduce();
		robotPet.introduce();
	}

	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド → " + lastName + firstName);
	}
}
