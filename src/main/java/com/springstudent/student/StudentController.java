
package com.springstudent.student;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gilles
 */
@RestController
@RequestMapping(path = "api/students")
public class StudentController {
    
    
    @GetMapping
    public List<Student> getAllStudents(){
    
       List<Student> students = Arrays.asList(
                new Student (1L,"John Doe","johndoe@gmail.com",Gender.MALE),
               new Student (2L,"Jeanne Doe","jeannedoe@gmail.com",Gender.FEMALE)
        );
       return students;
    }
    
}
