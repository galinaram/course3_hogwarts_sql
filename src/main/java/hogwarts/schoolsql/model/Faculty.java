package hogwarts.schoolsql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private Long id;
    private final String name;
    private final String color;

    public Faculty(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public void setId(long id){
        this.id = id;
    }
}
