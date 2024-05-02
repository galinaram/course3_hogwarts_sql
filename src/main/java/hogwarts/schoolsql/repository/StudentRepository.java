package hogwarts.schoolsql.repository;

import hogwarts.schoolsql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
