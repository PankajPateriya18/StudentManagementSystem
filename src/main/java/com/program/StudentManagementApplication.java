package com.program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class StudentManagementApplication{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Student st1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//		studentRepository.save(st1);
//		
//		Student st2 = new Student("Ramesh", "Tyagi", "ramesh@gmail.com");
//		studentRepository.save(st2);
//		
//		Student st3 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//		studentRepository.save(st3);
//		
//		Student st4 = new Student("Tony", "Stark", "tony@gmail.com");
//		studentRepository.save(st4);
//	}
	
}
