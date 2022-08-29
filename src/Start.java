import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentSDao;
public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		System.out.println("Welcome to student Management App");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
		System.out.println("PRESS 4 TO EXIT");
		int c = Integer.parseInt(br.readLine());
		
		
		
		if(c==1) {
		
			//add student
			
			System.out.println("enter user name :");
			String name = br.readLine();
			System.out.println("enter user phone:");
			String phone = br.readLine();
			System.out.println("enter user city: ");
			String city = br.readLine();
			
			//create student object to store student
			Student st = new Student(name ,phone , city);
			boolean answer = StudentSDao.insertStudentToDB(st);
			if(answer) {
				System.out.println("Student added successfully..!");
			}
			else {
				System.out.println("something went wrong try again..!");
			}
			
			System.out.println(st);
			
		}else if (c==2) {
			
			//delete student
			System.out.println("enter student id to delete:");
			int userId= Integer.parseInt(br.readLine());
		boolean	f= StudentSDao.deletestudent(userId);
			if(f) {
				System.out.println("deleted..!");
			}
			else {
				System.out.println("something went wrong");
			}
		}else if (c==3) {
			StudentSDao.showAllStudent();
			
			//display student
		}else if(c==4) {
			//exit
			break;
 		}else {
 			
 		}
		System.out.println("thank you for using my apllication"); 
		System.out.println("see you sonn");
		}
		
		
	}

}
