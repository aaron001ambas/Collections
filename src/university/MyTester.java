package university;

import java.util.ArrayList;

public class MyTester {
	static ArrayList studentsList = new ArrayList<>();
	public static void main(String[] args) {
		String inputForSearching = "John";
		
		String addStudentFullName = "John Sumitsu";
		String addStudentID = "2014-100348";
		String addStudentCourse = "IT";
		String addStudentGender = "Male";
		String addStudentYear = "2014";
		String addStudentMobileNo = "192";
		String addStudentStatus = "Regular";
		
		studentsList.add("Name: John Smith			ID: 001			Course: Computer Science\r\n" + 
				"Gender: Male	Year: 1st Year		Mobile No.: 123		Status: N/A");
		studentsList.add("Name: Juan Carlos			ID: 003			Course: Computer Science\r\n" + 
				"Gender: Male	Year: 1st Year		Mobile No.: 125		Status: N/A");
		studentsList.add("Name: John Johnson			ID: 004			Course: Computer Engineering\r\n" + 
				"Gender: Male	Year: 1st Year		Mobile No.: 126		Status: Regular");
		studentsList.add("Name: Mario Rossi			ID: 005			Course: Computer Engineering\r\n" + 
				"Gender: Male	Year: 1st Year		Mobile No.: 127		Status: Regular");
		studentsList.add("Name: James Smith			ID: 006			Course: Computer Science\r\n" + 
				"Gender: Male	Year: 1st Year		Mobile No.: 128		Status: Regular");
		studentsList.add("Name: David Smith			ID: 007			Course: Information Technology\r\n" + 
				"Gender: Male	Year: 1st Year		Mobile No.: 129		Status: Irregular");
		studentsList.add("Name: Kim Nguyen			ID: 008			Course: Multimedia Arts\r\n" + 
				"Gender: Male	Year: 2nd Year		Mobile No.: 130		Status: Irregular");
		studentsList.add("Name: Lance Myres			ID: 009			Course: Game Designer\r\n" + 
				"Gender: Male	Year: 2nd Year		Mobile No.: 131		Status: Irregular");
		studentsList.add("Name: Michael Stevenson			ID: 010			Course: Information Technology\r\n" + 
				"Gender: Male	Year: 2nd Year		Mobile No.: 132		Status: Irregular");
		studentsList.add("Name: Joe Smiths			ID: 002			Course: Information Technology\r\n" + 
				"Gender: Male	Year: 1st Year		Mobile No.: 124		Status: N/A");
		studentsList.add("Name: " + addStudentFullName + " 			ID: " + addStudentID + "			Course: " + addStudentCourse + "\r\n" + 
				"Gender: " + addStudentGender + "	Year: " + addStudentYear + "		Mobile No.: " + addStudentMobileNo + "		Status: " +
				addStudentStatus);
		
		Student201.printAll(studentsList);
		Student201.printRegs(studentsList);
		Student201.printIrregs(studentsList);
	}
}
