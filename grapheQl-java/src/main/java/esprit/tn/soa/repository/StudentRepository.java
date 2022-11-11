package esprit.tn.soa.repository;

import java.util.ArrayList;
import java.util.List;

import tn.esprit.soa.entity.Student;

public class StudentRepository {

	private final List<Student> students;

	public StudentRepository() {
		students = new ArrayList<>();
		
		students.add(new Student("13017625", "yassine", "yassine@mail.com"));
		students.add(new Student("14500472", "moataz", "moataz@mail.com"));
	}
	
	public List<Student> getAllStudents() {
		return students;
	}
	
	public void saveStudent(Student student) {
		students.add(student);
	}
	
	public Student getByCin(String cin) {
		for (Student student : students) {
			if (student.getCin().equals(cin))
				return student;
		}
		return null ;
	}
}
