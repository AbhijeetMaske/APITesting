package com.SynergyAPI.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LandingController {

	@Autowired
	private StudentDataService studentDataService;

	@GetMapping("/")
	public String landingPage() {
		// Redirect to the landing page when accessing the root URL
		return "redirect:/landing.html";
	}

	@RestController
	@RequestMapping("/api/students")
	public class StudentController {

		// Retrieve all student data
		@GetMapping("/all")
		public ResponseEntity<?> getAllStudents() {
			return new ResponseEntity<>(studentDataService.getAllStudents(), HttpStatus.OK);
		}

		// Add new student data
		@PostMapping("/add")
		public ResponseEntity<StudentData> addStudent(@RequestBody StudentData newStudentData) {
			studentDataService.addStudent(newStudentData);
			return new ResponseEntity<>(newStudentData, HttpStatus.CREATED);
		}

		// Delete student data by ID
		@DeleteMapping("/delete")
		public ResponseEntity<String> deleteStudentById(@RequestParam Long studentId) {
			boolean isRemoved = studentDataService.deleteStudentById(studentId);
			if (isRemoved) {
				return new ResponseEntity<>("Student data deleted successfully.", HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Student data not found.", HttpStatus.NOT_FOUND);
			}
		}

		// Retrieve student data by ID
		@GetMapping("/get")
		public ResponseEntity<?> getStudentById(@RequestParam Long studentId) {
			StudentData studentData = studentDataService.getStudentById(studentId);
			if (studentData != null) {
				return new ResponseEntity<>(studentData, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Student data not found.", HttpStatus.NOT_FOUND);
			}
		}
	}
}
