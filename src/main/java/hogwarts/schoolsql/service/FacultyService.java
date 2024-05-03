package hogwarts.schoolsql.service;

import hogwarts.schoolsql.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hogwarts.schoolsql.model.Faculty;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;
    public Faculty createFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }
    public Faculty findFaculty(long id){
        return facultyRepository.findById(id).get();
    }
    public Faculty editFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }
    public void deleteFaculty(long id){
        facultyRepository.deleteById(id);
    }
    public Collection<Faculty> getAllFaculty(){
        return facultyRepository.findAll();
    }

    public Collection<Faculty> findByName(String name){
        return facultyRepository.findFacultyByName(name);
    }
    public Collection<Faculty> findByColor(String color){
        return facultyRepository.findFacultyByColor(color);
    }
}

