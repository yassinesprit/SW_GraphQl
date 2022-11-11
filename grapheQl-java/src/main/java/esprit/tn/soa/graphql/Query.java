package esprit.tn.soa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.soa.repository.StudentRepository;
import tn.esprit.soa.entity.Student;

public class Query implements GraphQLRootResolver {

	private final StudentRepository studentRepository;
	public Query (StudentRepository studentRepository)
	{
		this.studentRepository=studentRepository;
	}
	public List<Student> allstudents()
	{
	return 	studentRepository.getAllStudents();
	}
	
	public Student getByCin(String cin) {
		return studentRepository.getByCin(cin);
	}
}
