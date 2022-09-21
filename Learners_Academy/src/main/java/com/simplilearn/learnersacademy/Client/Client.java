package com.simplilearn.learnersacademy.Client;


import com.simplilearn.learnersacademy.dto.Classes;
import com.simplilearn.learnersacademy.dto.Subject;
import com.simplilearn.learnersacademy.dto.Teacher;
import com.simplilearn.learnersacademy.service.ClassesService;
import com.simplilearn.learnersacademy.service.ClassesServiceImpl;
import com.simplilearn.learnersacademy.service.SubjectService;
import com.simplilearn.learnersacademy.service.SubjectServiceImpl;
import com.simplilearn.learnersacademy.service.TeacherService;
import com.simplilearn.learnersacademy.service.TeacherServiceImpl;

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
