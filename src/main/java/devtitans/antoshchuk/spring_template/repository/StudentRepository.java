package devtitans.antoshchuk.spring_template.repository;

import devtitans.antoshchuk.spring_template.model.Group;
import devtitans.antoshchuk.spring_template.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByGroup(Group group);
}
