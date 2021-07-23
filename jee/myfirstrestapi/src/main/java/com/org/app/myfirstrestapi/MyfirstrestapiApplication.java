package com.org.app.myfirstrestapi;

import java.util.Date;
import java.util.List;

import com.org.app.myfirstrestapi.entity.Student;
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

	public static void main(String[] args) {
		System.out.println("MAIN START");
		SpringApplication.run(MyfirstrestapiApplication.class, args);
		System.out.println("MAIN End");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student stu = new Student();
		stu.setDob(new Date());
		stu.setFirstname("TestName" + Math.random());
		stu.setLastname("My LastName1");	
		stu.setTs(new Date());
		//stuRepo.save(stu);

		//System.out.println(stuRepo.findAll());

		//System.out.println(stuRepo.findById(8));

		List<Student> lsts = stuRepo.findByLastnameOrFirstname("My LastName1","TestName0.7805068190686674");

		System.out.println(lsts);

		System.out.println("=====================");

		System.out.println(stuRepo.byLNFN("My LastName1","TestName0.7805068190686674"));

		System.out.println("========Record Inserted");
		
	}

}
