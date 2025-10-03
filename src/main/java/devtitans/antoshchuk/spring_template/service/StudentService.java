package devtitans.antoshchuk.spring_template.service;

import devtitans.antoshchuk.spring_template.model.Student;
import devtitans.antoshchuk.spring_template.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    public void updateStudent(long id, Student newStudent) {
        Student student = studentRepository.findById(id).get();
        student.setFirstName(newStudent.getFirstName());
        student.setLastName(newStudent.getLastName());
        studentRepository.save(student);
    }

}
