package com.org.app.myfirstrestapi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.org.app.myfirstrestapi.entity.Account;
import com.org.app.myfirstrestapi.entity.CCPayment;
import com.org.app.myfirstrestapi.entity.College;
import com.org.app.myfirstrestapi.entity.CurrentAccount;
import com.org.app.myfirstrestapi.entity.Employee;
import com.org.app.myfirstrestapi.entity.GrocerryOrder;
import com.org.app.myfirstrestapi.entity.MobileOrder;
import com.org.app.myfirstrestapi.entity.Phone;
import com.org.app.myfirstrestapi.entity.SavingsAccount;
import com.org.app.myfirstrestapi.entity.Student;
import com.org.app.myfirstrestapi.entity.StudentType;
import com.org.app.myfirstrestapi.entity.Subject;
import com.org.app.myfirstrestapi.entity.UPIPayment;
import com.org.app.myfirstrestapi.repo.AccountRepo;
import com.org.app.myfirstrestapi.repo.CollegeRepo;
import com.org.app.myfirstrestapi.repo.EmployeeRepo;
import com.org.app.myfirstrestapi.repo.OrderRepo;
import com.org.app.myfirstrestapi.repo.PaymentRepo;
import com.org.app.myfirstrestapi.repo.StudentRepo;
import com.org.app.myfirstrestapi.repo.SubjectRepo;

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

	@Autowired
	private EmployeeRepo empRepo;

	@Autowired
	private SubjectRepo subRepo;

	@Autowired
	private OrderRepo ordRepo;

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private PaymentRepo paymentRepo;

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
		sub1.setSubcode("S001");
		sub1.setSubject("Physics");
		sub1.setSemester("1");

		Subject sub2 = new Subject();
		sub2.setSubcode("S002");
		sub2.setSubject("Chemistry2");
		sub2.setSemester("2");

		Subject sub3 = new Subject();
		sub3.setSubcode("S003");
		sub3.setSubject("Maths");
		sub3.setSemester("3");

		lstSub.add(sub1);
		lstSub.add(sub2);
		lstSub.add(sub3);

		//subRepo.save(sub1);
		//subRepo.save(sub2);
		//subRepo.save(sub3);


		Student stu1 = new Student();
		stu1.setDob(new Date());
		stu1.setFirstname("TestName" + Math.random());
		stu1.setLastname("My LastName1");	
		stu1.setTs(new Date(2000,2,2));
		stu1.setsType(sType1);
		stu1.setSubjects(lstSub);   
		
		System.out.println(stu1);
		System.out.println("==================##1==");

		Student stu2 = new Student();
		stu2.setDob(new Date());
		stu2.setFirstname("AnotherName" + Math.random());
		stu2.setLastname("Anothjer");	
		stu2.setTs(new Date());
		stu2.setsType(sType2);
		stu2.setSubjects(lstSub);


		System.out.println(stu2);
		System.out.println("==================##2==");


		lstStu.add(stu1);
		lstStu.add(stu2);

		College college = new College();
		college.setAddress("Some Address");
		college.setName("ABCD College");
		college.setStudents(lstStu);

		//collRepo.save(college);

		//System.out.println(collRepo.fetchStudentsByCollegeId(39));
		

		Phone p1 = new Phone();
		p1.setpNumber("1234567890");

		Phone p2 = new Phone();
		p2.setpNumber("1234567899");

		List<Phone> phones = new ArrayList<>();
		phones.add(p1);
		phones.add(p2);

		Employee emp1 = new Employee();
		emp1.setName("Test123" + Math.random());
		emp1.setPhones(phones);

		p1.setEmp(emp1);   
		p2.setEmp(emp1);  

		//empRepo.save(emp1);

		//empRepo.getEmployees().forEach(System.out::println);

		//collRepo.deleteById(new Integer(33));

		//stuRepo.save(stu);

		//System.out.println(stuRepo.findAll());

		//System.out.println(stuRepo.findById(8));

		//List<Student> lsts = stuRepo.findByLastnameOrFirstname("My LastName1","TestName0.7805068190686674");

		//System.out.println(lsts);

		//System.out.println("=====================");

		//System.out.println(stuRepo.byLNFN("My LastName1","TestName0.7805068190686674"));

		MobileOrder mo = new MobileOrder();
		mo.setAmount(100);
		mo.setIs4g("true");
		mo.setModel("Samsung");
		mo.setName("4G Mobile Phones");

		GrocerryOrder go = new GrocerryOrder();
		go.setAmount(99);
		go.setName("Tomato");
		go.setPerishable(true);
		go.setQuantity(10);

		//ordRepo.save(mo);
		//ordRepo.save(go);

		System.out.println("####");   
		
		//ordRepo.getAllOrders().forEach(System.out::println);


		SavingsAccount sb1 = new SavingsAccount();
		sb1.setCustid("12345");
		sb1.setInterest(10);
		sb1.setName("Test124" + Math.random());

		CurrentAccount ca = new CurrentAccount();
		ca.setName("Retail Shop");
		ca.setVendorId(123);

		CurrentAccount ca2 = new CurrentAccount();
		ca2.setName("Grocery Shop");
		ca2.setVendorId(258);
		//accountRepo.save(sb1);
		//accountRepo.save(ca);
		//accountRepo.save(ca2);

		List<Account> acts = accountRepo.findAll();
		for(Account act : acts) {
			if (act instanceof SavingsAccount){
				SavingsAccount sav = (SavingsAccount) act;
				//System.out.println(sav);
			} else if (act instanceof CurrentAccount) {
				CurrentAccount cur = (CurrentAccount)act;
				//System.out.println(cur);
			}
		}

		CCPayment cc1 = new CCPayment();
		cc1.setAmount(1253);
		cc1.setAuthCode("APPROVED001");
		cc1.setCcNumber("12345689987");
		
		UPIPayment upi = new UPIPayment();
		upi.setAmount(2564);
		upi.setUpicode("abcd@ocicici");

		paymentRepo.save(cc1);
		paymentRepo.save(upi);
		
		System.out.println("========Record Inserted");
		
	}

}
