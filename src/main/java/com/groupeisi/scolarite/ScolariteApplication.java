package com.groupeisi.scolarite;

import com.groupeisi.scolarite.entity.Student;
import com.groupeisi.scolarite.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/students")
public class ScolariteApplication {

	@Autowired
	private StudentService studentService;

	// this method can be accessed by user whose role is user
	@GetMapping("/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable int studentId){
		return ResponseEntity.ok(studentService.getStudent(studentId));
	}

	// this method can be accessed by user whose role is admin
	@GetMapping
	public ResponseEntity<List<Student>> findAllStudents(){
		return ResponseEntity.ok(studentService.getAllStudents());
	}

	public static void main(String[] args) {
		SpringApplication.run(ScolariteApplication.class, args);
	}

}
