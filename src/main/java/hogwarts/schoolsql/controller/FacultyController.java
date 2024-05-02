package hogwarts.schoolsql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import hogwarts.schoolsql.model.Faculty;
import hogwarts.schoolsql.service.FacultyService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @GetMapping("{id}")
    public ResponseEntity<Faculty> getFacultyInfo(@PathVariable long id){
        Faculty faculty = facultyService.findFaculty(id);
        if (faculty == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }

    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty){
        return facultyService.createFaculty(faculty);
    }

    @PutMapping
    public ResponseEntity<Faculty> editFaculty(@RequestBody Faculty faculty){
        Faculty editedFaculty = facultyService.editFaculty(faculty);
        if (editedFaculty == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(editedFaculty);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Faculty> deleteFaculty(@PathVariable long id){
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Collection<Faculty> getFacultyWithOneColor (@RequestParam String color){
        List<Faculty> facultyCollection = new ArrayList<>();
        int i = 0;
        while (facultyService.findFaculty(i)!= null){
            if(Objects.equals(facultyService.findFaculty(i).getColor(), color)){
                facultyCollection.add(facultyService.findFaculty(i));

            }
        }
        return facultyCollection;
    }
}
