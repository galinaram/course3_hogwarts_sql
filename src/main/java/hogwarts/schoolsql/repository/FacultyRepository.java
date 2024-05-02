package hogwarts.schoolsql.repository;

import hogwarts.schoolsql.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
