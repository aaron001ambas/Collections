package university;

import java.util.ArrayList;

public class Student201 {
	
	public static void printAll(ArrayList studentsList) {
		System.out.println("Printing All Students...");
		for (int i = 0; i < studentsList.size(); i++) {
			System.out.println((i+1) + ". " + studentsList.get(i));
			System.out.println("-----------------------------------------------------------------------------------------");
		}
	}
	
	public static void printRegs(ArrayList studentsList) {
		for (int y = 0; y < 3; y++) {
		System.out.println();
		}
		System.out.println("Printing Regular Students...");
		for (int i = 0; i < studentsList.size(); i++) {
			if(studentsList.get(i).toString().contains("Regular")) {
				System.out.println((i+1) + ". " + studentsList.get(i));
				System.out.println("-----------------------------------------------------------------------------------------");
			}
		}
	}
	
	public static void printIrregs(ArrayList studentsList) {
		for (int y = 0; y < 3; y++) {
		System.out.println();
		}
		System.out.println("Printing Irregular Students...");
		for (int i = 0; i < studentsList.size(); i++) {
			if (studentsList.get(i).toString().contains("Irregular")) {
				System.out.println((i+1) + ". " + studentsList.get(i));
				System.out.println("-----------------------------------------------------------------------------------------");
			}
		}
	}
	
}
