package com.learnersacademy.Client;


import com.learnersacademy.dto.Classes;
import com.learnersacademy.dto.Subject;
import com.learnersacademy.dto.Teacher;
import com.learnersacademy.service.ClassesService;
import com.learnersacademy.service.ClassesServiceImpl;
import com.learnersacademy.service.SubjectService;
import com.learnersacademy.service.SubjectServiceImpl;
import com.learnersacademy.service.TeacherService;
import com.learnersacademy.service.TeacherServiceImpl;

public class Client {

	public static void main(String agrs[]) {
	//class	
		ClassesService classservice=new ClassesServiceImpl();
//		Classes classes=new Classes("BCA 3");
//		int resultclass=classservice.addClasses(classes);
//		classservice.updateClasses(3,"Higher School");
//		System.out.println("Result : "+resultclass);
		
//		classservice.deleteClasses(7);
		Classes classes=classservice.searchClasses(13);
		System.out.println(classes);
	//subject	
//		SubjectService service =new SubjectServiceImpl();
//		Subject subject=new Subject("JAVA");
//		int custId=service.addSubject(subject);
//		System.out.println("Subject Id : "+custId);
		

	//teacher	
//			TeacherService service =new TeacherServiceImpl();
//			Teacher teacher=new Teacher("Ansul");
//			int custId=service.addTeacher(teacher);
//			System.out.println("Teacher Id : "+custId);
			
	}
}
