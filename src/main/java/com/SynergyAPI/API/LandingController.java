package com.SynergyAPI.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

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

		// Retrieve all student data and set a cookie
		@GetMapping("/all")
		public ResponseEntity<?> getAllStudents(HttpServletResponse response) {
			Cookie cookie = new Cookie("userRole", "Admin");
			cookie.setHttpOnly(true);
			cookie.setMaxAge(60 * 1); // Set cookie expiry to 1 hour
			response.addCookie(cookie); // Add cookie to response
			return new ResponseEntity<>(studentDataService.getAllStudents(), HttpStatus.OK);
		}

		// Retrieve student data by ID and get a cookie value
		@GetMapping("/get")
		public ResponseEntity<?> getStudentById(@RequestParam Long studentId,
				@CookieValue(value = "userRole", defaultValue = "guest") String userRole) {

			if ("guest".equals(userRole)) {
				return new ResponseEntity<>("Unauthorized access.", HttpStatus.UNAUTHORIZED);
			}
			StudentData studentData = studentDataService.getStudentById(studentId);
			if (studentData != null) {
				return new ResponseEntity<>(studentData, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Student data not found.", HttpStatus.NOT_FOUND);
			}
		}

		// Add new student data and set a cookie
		@PostMapping("/add")
		public ResponseEntity<StudentData> addStudent(@RequestBody StudentData newStudentData,
				HttpServletResponse response) {
			studentDataService.addStudent(newStudentData);
			Cookie cookie = new Cookie("lastAddedStudent", newStudentData.getName());
			// Set a cookie with the last added student name
			response.addCookie(cookie); 
			return new ResponseEntity<>(newStudentData, HttpStatus.CREATED);
		}

		// Delete student data by ID
		@DeleteMapping("/delete")
		public ResponseEntity<String> deleteStudentById(@RequestParam Long studentId,
				@CookieValue(value = "userRole", defaultValue = "guest") String userRole) {
			if ("guest".equals(userRole)) {
                return new ResponseEntity<>("Unauthorized access.", HttpStatus.UNAUTHORIZED);
            }
			
			boolean isRemoved = studentDataService.deleteStudentById(studentId);
			if (isRemoved) {
				return new ResponseEntity<>("Student data deleted successfully.", HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Student data not found.", HttpStatus.NOT_FOUND);
			}
		}

		// Update student data with PUT (replace entire record)
		@PutMapping("/update")
		public ResponseEntity<?> updateStudent(@RequestParam Long studentId,
				@RequestBody StudentData updatedStudentData,
				@CookieValue(value = "userRole", defaultValue = "guest") String userRole) {
			if ("guest".equals(userRole)) {
                return new ResponseEntity<>("Unauthorized access.", HttpStatus.UNAUTHORIZED);
            }
			
			StudentData existingStudent = studentDataService.getStudentById(studentId);
			if (existingStudent != null) {
				// Replace the entire student record with new data
				updatedStudentData.setId(studentId); // Maintain the same ID
				studentDataService.updateStudent(updatedStudentData);
				return new ResponseEntity<>(updatedStudentData, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Student data not found.", HttpStatus.NOT_FOUND);
			}
		}

		// Partially update student data with PATCH (update specific fields)
		@PatchMapping("/updatePartial")
		public ResponseEntity<?> partiallyUpdateStudent(@RequestParam Long studentId,
				@RequestBody StudentData partialUpdateData,
				@CookieValue(value = "userRole", defaultValue = "guest") String userRole) {
			if ("guest".equals(userRole)) {
                return new ResponseEntity<>("Unauthorized access.", HttpStatus.UNAUTHORIZED);
            }
			
			StudentData existingStudent = studentDataService.getStudentById(studentId);
			if (existingStudent != null) {
				// Update only the fields that are provided in the request
				if (partialUpdateData.getName() != null) {
					existingStudent.setName(partialUpdateData.getName());
				}
				if (partialUpdateData.getAge() != 0) {
					existingStudent.setAge(partialUpdateData.getAge());
				}
				if (partialUpdateData.getGrade() != null) {
					existingStudent.setGrade(partialUpdateData.getGrade());
				}
				if (partialUpdateData.getEmail() != null) {
					existingStudent.setEmail(partialUpdateData.getEmail());
				}
				if (partialUpdateData.getLocation() != null) {
					existingStudent.setLocation(partialUpdateData.getLocation());
				}
				if (partialUpdateData.getSubject() != null) {
					existingStudent.setSubject(partialUpdateData.getSubject());
				}
				studentDataService.updateStudent(existingStudent);
				return new ResponseEntity<>(existingStudent, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Student data not found.", HttpStatus.NOT_FOUND);
			}
		}
	}
}
