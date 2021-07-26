package com.org.app.myfirstrestapi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.org.app.myfirstrestapi.entity.College;
import com.org.app.myfirstrestapi.entity.Student;
import com.org.app.myfirstrestapi.entity.StudentType;
import com.org.app.myfirstrestapi.entity.Subject;
import com.org.app.myfirstrestapi.repo.CollegeRepo;
import com.org.app.myfirstrestapi.repo.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.org.app")
public class MyfirstrestapiApplication implements CommandLineRunner {

	@Autowired
	private StudentRepo stuRepo;

	@Autowired
	private CollegeRepo collRepo;

	public static void main(String[] args) {
		System.out.println("MAIN START");
		SpringApplication.run(MyfirstrestapiApplication.class, args);
		System.out.println("MAIN End");
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Student> lstStu = new ArrayList<>();
		List<Subject> lstSub = new ArrayList<>();

		StudentType sType1 = new StudentType();
		sType1.setName("FullTime");

		StudentType sType2 = new StudentType();
		sType2.setName("PartTime");


		Subject sub1 = new Subject();
		sub1.setSubject("Physics");
		sub1.setSemester("1");

		Subject sub2 = new Subject();
		sub2.setSubject("Chemistry2");
		sub2.setSemester("1");

		Subject sub3 = new Subject();
		sub3.setSubject("Maths");
		sub3.setSemester("1");

		lstSub.add(sub1);
		lstSub.add(sub2);
		lstSub.add(sub3);


		Student stu1 = new Student();
		stu1.setDob(new Date());
		stu1.setFirstname("TestName" + Math.random());
		stu1.setLastname("My LastName1");	
		stu1.setTs(new Date(2000,2,2));
		stu1.setsType(sType1);
		stu1.setSubjects(lstSub);   
		
		System.out.println("==================age==" + stu1.getAge());

		Student stu2 = new Student();
		stu2.setDob(new Date());
		stu2.setFirstname("AnotherName" + Math.random());
		stu2.setLastname("Anothjer");	
		stu2.setTs(new Date());
		stu2.setsType(sType2);
		stu2.setSubjects(lstSub);


		lstStu.add(stu1);
		lstStu.add(stu2);

		College college = new College();
		college.setAddress("Some Address");
		college.setName("ABCD College");
		college.setStudents(lstStu);

		collRepo.save(college);

		System.out.println(collRepo.fetchStudentsByCollegeId(39));
		

		//collRepo.deleteById(new Integer(33));

		//stuRepo.save(stu);

		//System.out.println(stuRepo.findAll());

		//System.out.println(stuRepo.findById(8));

		//List<Student> lsts = stuRepo.findByLastnameOrFirstname("My LastName1","TestName0.7805068190686674");

		//System.out.println(lsts);

		//System.out.println("=====================");

		//System.out.println(stuRepo.byLNFN("My LastName1","TestName0.7805068190686674"));

		System.out.println("========Record Inserted");
		
	}

}
