package hogwarts.schoolsql.repository;

import hogwarts.schoolsql.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findFacultyByName(String name);
    Collection<Faculty> findFacultyByColor(String color);
}
