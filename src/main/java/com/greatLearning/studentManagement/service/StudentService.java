package com.greatLearning.studentManagement.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.greatLearning.studentManagement.entity.*;

public interface StudentService {
	public List<Student> findAll ();
	
	public Student findById(int theID);
	
	public void save(Student thestudent);
	
	public void deleteById(int theId);

}
